package com.potato.pay.model.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "order")
@SuperBuilder
@Data
@RequiredArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "pay_id")
    private Long payId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "pay_status")
    private String payStatus;
    @Column(name = "total_price")
    private Long totalPrice;


}
