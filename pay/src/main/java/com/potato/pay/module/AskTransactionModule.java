package com.potato.pay.module;

import com.potato.pay.dao.AskRepository;
import com.potato.pay.model.entity.Ask;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AskTransactionModule {

    private final AskRepository askRepository;

    public Ask getAsk(Long askId) {
        Ask ask = askRepository.findById(askId).get();

        return ask;
    }

    public void updatePayId(Long askId, Long payId) {

        Ask ask = askRepository.findById(askId).get();

        if (ObjectUtils.isNotEmpty(ask.getPayId())) {
            // TODO: 2023-01-07 에러 만들기
        }

        ask.setPayId(payId);

        askRepository.save(ask);
    }

}
