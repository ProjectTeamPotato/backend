package com.potato.reservation.dao;

import com.potato.reservation.model.entity.Pay;
import org.springframework.data.repository.CrudRepository;

public interface PayRepository extends CrudRepository<Pay, Long> { }