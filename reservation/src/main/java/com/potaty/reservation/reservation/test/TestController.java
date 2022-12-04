package com.potaty.reservation.reservation.test;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Test", description = "테스트")
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestProducerService testProducerService;

    @PostMapping("/test")
    public void test(@RequestBody String message) {
        testProducerService.sendMessage(message);
    }

}
