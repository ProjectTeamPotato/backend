package com.potato.pay.service;

import com.potato.pay.api.pay.PayModule;
import com.potato.pay.api.pay.PayModuleFactory;
import com.potato.pay.api.pay.dto.response.PayResponse;
import com.potato.pay.constant.ResponseCode;
import com.potato.pay.dao.PayRepository;
import com.potato.pay.model.entity.Pay;
import com.potato.pay.module.PayTransactionModule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PayService {

    private final PayModuleFactory payModuleFactory;
    private final PayTransactionModule payTransactionModule;

    public PayResponse getPay(Long id) {

        // TODO: 2023-01-07 API 구현
        Pay pay = payTransactionModule.getPay(id);

        return PayResponse.builder()
                .pay(pay)
                .responseCode(ResponseCode.SUCCESS)
                .build();
    }

    public PayResponse getTransaction(Long id) {

        // TODO: 2023-01-07 API 구현
        Pay pay = payRepository.findById(id).get();

        PayModule payModule = payModuleFactory.getPayModule(pay.getPayMethod());

        return payModule.getTransaction(pay.getId());
    }

}
