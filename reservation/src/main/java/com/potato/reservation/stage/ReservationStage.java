package com.potato.reservation.stage;

import com.potato.reservation.model.entity.Ask;
import com.potato.reservation.model.entity.Pay;
import com.potato.reservation.module.AskTransactionModule;
import com.potato.reservation.module.PayModule;
import com.potato.reservation.module.dto.request.CreatePayRequest;
import com.potato.reservation.stage.constant.ReservationStep;
import com.potato.reservation.stage.dto.ReservationParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ReservationStage {

    private final AskTransactionModule askTransactionModule;
    private final PayModule payModule;

    public boolean check(ReservationParam reservationParam) {


        if (!askTransactionModule.checkSuccessAsk(reservationParam.getBasketUuid())
        ) {
            // throw new Exception();
        }

        reservationParam.setReservationStep(ReservationStep.CREATE_ASK_ENTITY);
        return true;
    }

    public boolean createAskEntity(ReservationParam reservationParam) {

        Long askId = askTransactionModule.createInitAsk(
                reservationParam.getUserId(),
                reservationParam.getBasketUuid()
        );

        reservationParam.setReservationStep(ReservationStep.REQUEST_PAY);
        reservationParam.setAskId(askId);
        return true;
    }

    public boolean requestPay(ReservationParam reservationParam) {

        Ask ask = askTransactionModule.getAsk(reservationParam.getAskId());

        Pay pay = payModule.requestPay(
                CreatePayRequest.builder()
                        .payMethod(reservationParam.getPayMethod())
                        .couponId(reservationParam.getCouponId())
                        .totalAmount(ask.getTotalPrice())
                        .build()
        );

        askTransactionModule.updatePayId(reservationParam.getAskId(), pay.getId());

        reservationParam.setReservationStep(ReservationStep.SET_COMPLETE);
        return true;
    }

    public boolean setComplete(ReservationParam reservationParam) {

        askTransactionModule.setComplete(reservationParam.getAskId());

        reservationParam.setReservationStep(ReservationStep.STAGE_COMPLETE);
        return true;
    }

}
