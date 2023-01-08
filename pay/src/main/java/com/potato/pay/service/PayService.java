package com.potato.pay.service;

import com.potato.pay.api.pay.PayModule;
import com.potato.pay.api.pay.PayModuleFactory;
import com.potato.pay.api.pay.dto.response.PayResponse;
import com.potato.pay.constant.ResponseCode;
import com.potato.pay.model.entity.Pay;
import com.potato.pay.module.PayTransactionModule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PayService {

    private final PayModuleFactory payModuleFactory;
    private final PayTransactionModule payTransactionModule;

    // Ask로 바꿔야하나
    public PayResponse createPay(Long payId) {
        Pay pay = payTransactionModule.getPay(payId);
        PayModule payModule = payModuleFactory.getPayModule(pay.getPayType());
        return payModule.createTransaction(payId);
    }

}
