package com.potato.pay.api.pay.dto.body;

import com.potato.pay.constant.PayType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateTransactionBody {

    Long orderId;
    PayType payType;
    Long totalMount;
    Float discountRatio;
    Long couponId;


}
