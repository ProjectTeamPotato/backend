package com.potato.pay.api.pay.toss;

import com.potato.pay.api.pay.PayModule;
import com.potato.pay.api.pay.dto.body.CreateTransactionBody;
import com.potato.pay.api.pay.dto.response.PayResponse;
import com.potato.pay.module.PayTransactionModule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Component
public class TossApiModule implements PayModule {
    private final PayTransactionModule payTransactionModule;

    @Override
    public PayResponse getTransaction(Long payId) {
        return new PayResponse();
    }

    @Override
    public PayResponse createTransaction(Long payId) {



        return new PayResponse();
    }

    @Override
    public PayResponse cancelTransaction(Long payId) {
        return new PayResponse();
    }


}
