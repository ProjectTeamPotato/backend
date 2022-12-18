package com.potato.reservation.dao;

import com.potato.reservation.model.entity.Basket;
import org.springframework.data.repository.CrudRepository;

public interface BasketRepository extends CrudRepository<Basket, Long> {
}
