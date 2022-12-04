package com.potaty.reservation.reservation.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
@RequiredArgsConstructor
public class TestConsumeService {

    @KafkaListener(topics = "lilac", groupId = "group-id-test")
    public void consume(String message) {
        try {
            log.info("Message : " + message);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }


}
