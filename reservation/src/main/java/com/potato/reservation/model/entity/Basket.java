package com.potato.reservation.model.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "basket")
@SuperBuilder
@Data
@RequiredArgsConstructor
public class Basket {

    @EmbeddedId
    private BasketUUID basketuuid;
    @Column(name = "ask_id")
    private Long askId;
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "count")
    private Integer count;


}
