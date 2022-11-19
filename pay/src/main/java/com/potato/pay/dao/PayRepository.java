package com.potato.pay.dao;

import com.potato.pay.model.entity.Pay;
import org.springframework.data.repository.CrudRepository;

public interface PayRepository extends CrudRepository<Pay, Long> { }
