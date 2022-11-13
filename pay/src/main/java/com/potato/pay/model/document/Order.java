package com.potato.pay.model.document;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;

@Document(collation = "order")
@SuperBuilder
@Data
public class Order {

    @Id
    private Long id;
    @Field(name = "pay_id")
    private Long payId;
    @Field(name = "user_id")
    private Long userId;
    @Field(name = "pay_status")
    private String payStatus;
    @Field(name = "total_price")
    private Long totalPrice;


}
