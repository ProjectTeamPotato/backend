package com.potato.pay.dao;

import com.potato.pay.model.entity.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Long> { }
