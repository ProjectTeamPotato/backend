package com.potato.pay.api.pay.toss;

import com.potato.pay.api.pay.PayModule;
import com.potato.pay.api.pay.dto.response.PayResponse;
import com.potato.pay.api.pay.toss.dto.body.CreateTossPayRequestBody;
import com.potato.pay.api.pay.toss.dto.response.TossResponse;
import com.potato.pay.api.pay.toss.model.TossPayments;
import com.potato.pay.constant.ResponseCode;
import com.potato.pay.model.entity.Pay;
import com.potato.pay.module.PayTransactionModule;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class TossApiModule implements PayModule {
    private final PayTransactionModule payTransactionModule;
    private final TossApi tossApi;

    @Override
    public PayResponse getTransaction(Long payId) {
        return new PayResponse();
    }

    @Override
    public PayResponse createTransaction(Long payId) {
        Pay pay = payTransactionModule.getPay(payId);

        CreateTossPayRequestBody createTossPayRequestBody = CreateTossPayRequestBody.builder()
                .tossMethod(pay.getPayMethod().convertToTossMethod())
                .amount(pay.getAmount())
                .orderId(UUID.randomUUID().toString())
                .orderName("TEST")
                .returnUrl("http://127.0.0.1")
                .build();

        TossResponse<TossPayments> tossResponse = tossApi.createPay(createTossPayRequestBody);

        if (ObjectUtils.isEmpty(tossResponse.getData())) {
            // throw Error

            return PayResponse.builder()
                    .payId(payId)
                    .responseCode(ResponseCode.FAIL)
                    .build();
        }

        payTransactionModule.updatePaymentKey(payId, tossResponse.getData().getPaymentKey());

        return PayResponse.builder()
                .payId(payId)
                .responseCode(ResponseCode.SUCCESS)
                .build();
    }

    @Override
    public PayResponse cancelTransaction(Long payId) {
        return new PayResponse();
    }


}
