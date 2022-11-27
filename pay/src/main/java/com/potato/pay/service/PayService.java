package com.potato.pay.service;

import com.potato.pay.api.pay.PayModule;
import com.potato.pay.api.pay.PayModuleFactory;
import com.potato.pay.api.pay.dto.response.PayResponse;
import com.potato.pay.constant.ResponseCode;
import com.potato.pay.dao.PayRepository;
import com.potato.pay.model.entity.Pay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PayService {

    private final PayModuleFactory payModuleFactory;
    private final PayRepository payRepository;

    public PayResponse getPay(Long id) {

        // todo : refactoring
        Pay pay = payRepository.findById(id).get();

        return PayResponse.builder()
                .pay(pay)
                .responseCode(ResponseCode.SUCCESS)
                .build();
    }

    public PayResponse getTransaction(Long id) {

        // todo : refactoring
        Pay pay = payRepository.findById(id).get();

        PayModule payModule = payModuleFactory.getPayModule(pay.getPayMethod());

        return payModule.getTransaction(pay.getId());
    }

}
