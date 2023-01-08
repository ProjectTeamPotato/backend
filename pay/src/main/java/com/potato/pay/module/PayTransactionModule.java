package com.potato.pay.module;

import com.potato.pay.dao.PayRepository;
import com.potato.pay.model.entity.Pay;
import com.potato.pay.module.constant.TransactionConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
public class PayTransactionModule {

    private final PayRepository payRepository;

    public Pay getPay(Long payId) {
        Pay pay = payRepository.findById(payId).get();

        return pay;
    }

    @Transactional(TransactionConstant.MYSQL_TRANSACTION)
    public void updatePaymentKey(Long payId, String paymentKey) {
        Pay pay = payRepository.findById(payId).get();
        pay.setPaymentKey(paymentKey);
        payRepository.save(pay);
    }

}


