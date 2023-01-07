package com.potato.pay.module;

import com.potato.pay.dao.PayRepository;
import com.potato.pay.model.entity.Pay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PayTransactionModule {

    private final PayRepository payRepository;

    public Pay getPay(Long payId) {
        Pay pay = payRepository.findById(payId).get();

        return pay;
    }

}


