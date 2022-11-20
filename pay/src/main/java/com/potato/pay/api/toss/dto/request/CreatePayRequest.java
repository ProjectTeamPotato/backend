package com.potato.pay.api.toss.dto.request;

import com.potato.pay.api.toss.model.enumer.Method;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreatePayRequest {

    @NotEmpty
    String paymentKey;
    @NotEmpty
    String orderId;
    @NotNull
    Long amount;
    @NotEmpty
    String orderName;
    @NotEmpty
    String returnUrl;
    @NotNull
    Method method;

}
