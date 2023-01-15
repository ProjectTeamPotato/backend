package com.potato.reservation.repository;

import com.potato.reservation.constant.PayStatus;
import com.potato.reservation.model.entity.Ask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AskRepository extends JpaRepository<Ask, Long> {

    Ask findByBasketUuidAndPayStatus(UUID uuid, PayStatus payStatus);

}
