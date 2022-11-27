package com.potato.pay.api.pay.toss.dto.body;

import com.potato.pay.api.pay.toss.model.enumer.Method;
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
public class CreateTossPayRequestBody {

    @NotNull
    Method method;
    @NotNull
    Long amount;
    @NotEmpty
    String orderId;
    @NotEmpty
    String orderName;
    @NotEmpty
    String returnUrl;


}
