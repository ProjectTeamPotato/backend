package com.potato.reservation.module.dto.request;

import com.potato.reservation.constant.PayMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class CreatePayRequest {

    private PayMethod payMethod;
    private Long totalAmount;
    private Long couponId;

}
