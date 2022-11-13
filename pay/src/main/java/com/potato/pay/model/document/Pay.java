package com.potato.pay.model.document;

import com.potato.pay.constant.PayMethod;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;

@Document(collation = "pay")
@SuperBuilder
@Data
public class Pay {

    @Id
    private Long id;
    @Field(name = "user_id")
    private Long userId;
    @Field(name = "pay_mehtod")
    private PayMethod payMethod;
    private Long amount;
    @Field(name = "discount_amount")
    private Long discountAmount;
    @Field(name = "coupon_id")
    private Long couponId;
    @Field(name = "cash_receipt")
    private String cashReceipt;
    @Field(name = "point_ration")
    private Float pointRation;

}
