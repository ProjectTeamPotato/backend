package com.potato.reservation.module;

import com.potato.reservation.model.entity.Pay;
import com.potato.reservation.module.dto.request.CreatePayRequest;
import com.potato.reservation.module.dto.response.PayResponse;
import com.potato.reservation.module.dto.response.ResponseCode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class PayModule {

    @Value("${spring.pay.url}")
    private final String BASEURL;

    private final RestTemplate restTemplate;

    private ResponseEntity<PayResponse> request(HttpMethod httpMethod, String url, Object body) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        HttpEntity entity = new HttpEntity<>(body, headers);

        return restTemplate.exchange(BASEURL + url, httpMethod, entity, PayResponse.class);
    }

    public Pay requestPay(CreatePayRequest createPayRequest) {

        ResponseEntity<PayResponse> responseEntity = this.request(HttpMethod.POST, null, createPayRequest);

        PayResponse payResponse = responseEntity.getBody();

        if (ResponseCode.FAIL.equals(payResponse.getResponseCode())) {
            // throw new Exception();
        }

        return payResponse.getPay();
    }


}
