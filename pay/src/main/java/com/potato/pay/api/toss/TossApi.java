package com.potato.pay.api.toss;

import com.potato.pay.api.toss.dto.response.TossResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Component
public class TossApi {

    private final RestTemplate restTemplate;

    public TossResponse requestToss(String api, Object body, HttpMethod httpMethod) {

        restTemplate.ex

    }


}
