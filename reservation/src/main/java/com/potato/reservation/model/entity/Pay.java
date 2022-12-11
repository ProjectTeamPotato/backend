package com.potato.reservation.model.entity;

import com.potato.reservation.constant.PayMethod;
import com.potato.reservation.constant.PayStatus;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "pay")
@SuperBuilder
@Data
@RequiredArgsConstructor
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "pay_mehtod")
    private PayMethod payMethod;
    @Column(name = "pay_status")
    private PayStatus payStatus;
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
