package com.potato.pay.model.entity;

import com.potato.pay.constant.PayStatus;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "ask")
@SuperBuilder
@Data
@RequiredArgsConstructor
public class Ask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "pay_id")
    private Long payId;
    @Column(name = "basket_uuid")
    private UUID basketUuid;
    @Column(name = "pay_status")
    private PayStatus payStatus;
    @Column(name = "total_price")
    private Long totalPrice;
}
