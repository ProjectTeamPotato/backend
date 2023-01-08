package com.potato.pay.api.pay.toss;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.potato.pay.api.pay.toss.dto.body.CreateTossPayRequestBody;
import com.potato.pay.api.pay.toss.dto.response.TossResponse;
import com.potato.pay.api.pay.toss.model.TossPayments;
import com.potato.pay.model.entity.Pay;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Component
public class TossApi {
    private final String TOSS_URL = "https://api.tosspayments.com/v1/payments/";
    private final RestTemplate restTemplate;

    @Value("${api.pay.tosssecret}")
    private String secretKey;

    private ResponseEntity<String> request(HttpMethod httpMethod, String url, Object body) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("Authorization", "Basic " + secretKey);

        HttpEntity<?> httpEntity = new HttpEntity<>(body, httpHeaders);

        return restTemplate.exchange(url, httpMethod, httpEntity, String.class);
    }

    public TossResponse<TossPayments> createPay(CreateTossPayRequestBody requestBody) {
        String url = TOSS_URL;

        ResponseEntity<String> responseEntity = this.request(HttpMethod.POST, url, requestBody);

        return new TossResponse<>(responseEntity, TossPayments.class);
    }


}
