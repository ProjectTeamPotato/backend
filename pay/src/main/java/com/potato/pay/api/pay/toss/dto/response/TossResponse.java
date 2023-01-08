package com.potato.pay.api.pay.toss.dto.response;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.potato.pay.api.pay.toss.model.TossError;
import com.potato.pay.api.pay.toss.model.TossModel;
import com.potato.pay.api.pay.toss.model.TossPayments;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
@Data
public class TossResponse<T extends TossModel> {
    private String code;
    private String message;
    private T data;

    public TossResponse (ResponseEntity<String> responseEntity, Class<T> object) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            if (!responseEntity.getStatusCode().equals(HttpStatus.OK)) {
                TossError tossError = objectMapper.readValue(responseEntity.getBody(), TossError.class);
                this.code = tossError.getCode();
                this.message = tossError.getMessage();
            }

            // TODO: 2023-01-07 constructType 조사
            JavaType javaType = objectMapper.getTypeFactory().constructType(object);
            this.data = objectMapper.readValue(responseEntity.getBody(), javaType);
        } catch (Exception e) {
            log.error("Error : " + e);
            // throw Exception
        }
    }
}
