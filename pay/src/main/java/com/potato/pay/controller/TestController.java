package com.potato.pay.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Test", description = "테스트")
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {


    @GetMapping("/testGet")
    public String test(@RequestParam String test) {

        return test;
    }

    @PostMapping("/testService")
    public void testService() {}

}
