package com.potato.reservation.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.potato.reservation.stage.ReservationStage;
import com.potato.reservation.stage.constant.ReservationStep;
import com.potato.reservation.stage.dto.ReservationParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class ReservationStageCaller {

    private final ReservationStage reservationStage;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public boolean stageCall(ReservationParam reservationParam) {

        ReservationStep reservationStep = reservationParam.getReservationStep();

        return switch (reservationStep) {
            case CHECK -> reservationStage.check(reservationParam);
            case CREATE_ASK_ENTITY -> reservationStage.createAskEntity(reservationParam);
            case REQUEST_PAY -> reservationStage.requestPay(reservationParam);
            case SET_COMPLETE -> reservationStage.setComplete(reservationParam);
            case STAGE_COMPLETE -> true;
            default -> false;
        };
    }

    public void nextStagePublish(ReservationParam reservationParam) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            //Serialization
            String message = objectMapper.writeValueAsString(reservationParam);
            kafkaTemplate.send("reservation", message);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }
    }

}
