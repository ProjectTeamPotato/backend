package com.potato.pay.api.pay.toss;

import com.potato.pay.api.pay.PayModule;
import com.potato.pay.api.pay.dto.body.CreateTransactionBody;
import com.potato.pay.api.pay.dto.response.PayResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TossApiModule implements PayModule {

    @Override
    public PayResponse getTransaction(Long payId) {
        return new PayResponse();
    }

    @Override
    public PayResponse createTransaction(CreateTransactionBody createTransactionBody) {
        return new PayResponse();
    }

    @Override
    public PayResponse cancelTransaction(Long payId) {
        return new PayResponse();
    }


}
