package com.potato.pay.api.pay;

import com.potato.pay.api.pay.dto.body.CreateTransactionBody;
import com.potato.pay.api.pay.dto.response.PayResponse;

public interface PayModule {

    PayResponse getTransaction(Long payId);
    PayResponse createTransaction(CreateTransactionBody createTransactionBody);
    PayResponse cancelTransaction(Long payId);

}