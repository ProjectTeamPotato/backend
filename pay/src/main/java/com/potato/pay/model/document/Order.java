package com.potato.pay.model.document;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collation = "order")
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
