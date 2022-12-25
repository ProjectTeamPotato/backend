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

    public void stageCall(ReservationParam reservationParam) {

        ReservationStep reservationStep = reservationParam.getReservationStep();

        boolean result = switch (reservationStep) {
            case CHECK -> reservationStage.check(reservationParam);
            default -> false;
        };

        // TODO: 2022-12-25 이 부분 애매함.
        // stage Caller의 call에서 nextStageCall까지 하는거는 기능이 너무 넓음
        // 그렇다고 Stage쪽에서 nextStageCall을 호출하게되면 의존성이 무너질듯함
        if (result) {
            this.nextStageCall(reservationParam);
        }
    }

    private void nextStageCall(ReservationParam reservationParam) {
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
