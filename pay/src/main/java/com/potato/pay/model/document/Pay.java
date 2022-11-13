package com.potato.pay.model.document;

import com.potato.pay.constant.PayMethod;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@SuperBuilder
@RequiredArgsConstructor
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "pay_mehtod")
    private PayMethod payMethod;
    private Long amount;
    @Column(name = "discount_amount")
    private Long discountAmount;
    @Column(name = "coupon_id")
    private Long couponId;
    @Column(name = "cash_receipt")
    private String cashReceipt;
    @Column(name = "point_ration")
    private Float pointRation;

}
