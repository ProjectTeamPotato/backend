package com.potato.reservation.module;

import com.potato.reservation.constant.PayStatus;
import com.potato.reservation.model.entity.Ask;
import com.potato.reservation.repository.AskRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class AskTransactionModule {

    private final AskRepository askRepository;
    private final BasketTransactionModule basketTransactionModule;

    public Ask getAsk(Long id) {
       return askRepository.findById(id).get();
    }

    @Transactional
    public void setComplete(Long askId) {
        Ask ask = Ask.builder()
                .id(askId)
                .payStatus(PayStatus.SUCCESS)
                .build();

        askRepository.save(ask);
    }

    @Transactional
    public void updatePayId(Long askId, Long payId) {
        Ask ask = Ask.builder()
                .id(askId)
                .payId(payId)
                .build();

        askRepository.save(ask);
    }

    public boolean checkSuccessAsk(UUID basketUuid) {
        Ask ask = askRepository.findByBasketUuidAndPayStatus(
                basketUuid,
                PayStatus.SUCCESS
        );

        return ObjectUtils.isEmpty(ask);
    }

    @Transactional
    public Long createInitAsk(Long userId, UUID basketUuid) {

        Ask ask = Ask.builder()
                .userId(userId)
                .basketUuid(basketUuid)
                .totalPrice(
                        basketTransactionModule.getBasketPrice(basketUuid)
                )
                .payStatus(PayStatus.INIT)
                .build();

        askRepository.save(ask);

        return ask.getId();
    }


}
