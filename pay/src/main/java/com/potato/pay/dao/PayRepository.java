package com.potato.pay.dao;

import com.potato.pay.model.document.Pay;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayRepository extends MongoRepository<Pay, Long> { }
