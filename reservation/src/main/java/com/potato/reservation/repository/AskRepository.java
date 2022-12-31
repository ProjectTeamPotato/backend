package com.potato.reservation.repository;

import com.potato.reservation.constant.PayStatus;
import com.potato.reservation.model.entity.Ask;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface AskRepository extends CrudRepository<Ask, Long> {

    Ask findByBasketUuidAndPayStatus(UUID uuid, PayStatus payStatus);

}
