package com.potato.pay.api.pay.toss.dto.response;

import com.potato.pay.api.pay.toss.model.PayApiModel;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class TossResponse {

    String code;
    String message;
    PayApiModel payApiModel;

}
