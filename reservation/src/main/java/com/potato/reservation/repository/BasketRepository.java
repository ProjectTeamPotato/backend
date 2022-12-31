package com.potato.reservation.repository;

import com.potato.reservation.model.entity.Basket;
import com.potato.reservation.model.entity.BasketUUID;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface BasketRepository extends CrudRepository<Basket, Long> {

    List<Basket> findByBasketUuid(BasketUUID basketUuid);

}
