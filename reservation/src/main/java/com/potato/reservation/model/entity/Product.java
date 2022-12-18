package com.potato.reservation.model.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "product")
@SuperBuilder
@Data
@RequiredArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "seller_id")
    private Long sellerId;
    @Column(name = "hall_id")
    private Long hallId;
    @Column(name = "basket_id")
    private Long basketId;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_status")
    private String productStatus;
    @Column(name = "thumbnail_image_url")
    private String thumbnail_image_url;
    @Column(name = "casting")
    private String casting;
    @Column(name = "performance_date")
    private Date performanceDate;


}
