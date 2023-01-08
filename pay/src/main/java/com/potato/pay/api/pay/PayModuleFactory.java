package com.potato.pay.api.pay;

import com.potato.pay.api.pay.toss.TossApiModule;
import com.potato.pay.constant.PayType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PayModuleFactory {

    private final TossApiModule tossApiModule;

    public PayModule getPayModule(PayType payType) {

        switch (payType) {
            case TOSS:
                return tossApiModule;
            case KAKAO:
                return null;
            default:
                return null;
        }
    }

}
