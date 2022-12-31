package com.potato.reservation.repository;

import com.potato.reservation.model.entity.Pay;
import org.springframework.data.repository.CrudRepository;

public interface PayRepository extends CrudRepository<Pay, Long> { }