package com.potato.reservation.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.potato.reservation.stage.dto.ReservationParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReservationConsumerService {

    private final ReservationStageHandler reservationStageHandler;

    @KafkaListener(topics = "reservation", groupId = "potato-id-test")
    public void consume(String message) {
        try {
            log.info("Reservation Consumer Message : " + message);
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        //DeSerialization
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ReservationParam reservationParam = objectMapper.readValue(message, ReservationParam.class);
            reservationStageHandler.reservationHandle(reservationParam);
        } catch (JsonProcessingException e) {
            log.error("Json Mapping Error : " + e.getMessage());
        }

    }

}
