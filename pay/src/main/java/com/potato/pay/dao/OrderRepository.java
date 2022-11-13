package com.potato.pay.dao;

import com.potato.pay.model.document.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Long> { }
