package com.potato.pay.dao;

import com.potato.pay.model.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> { }
