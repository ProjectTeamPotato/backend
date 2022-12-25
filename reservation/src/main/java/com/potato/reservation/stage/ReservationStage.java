package com.potato.reservation.stage;

import com.potato.reservation.constant.PayStatus;
import com.potato.reservation.dao.AskRepository;
import com.potato.reservation.model.entity.Ask;
import com.potato.reservation.stage.constant.ReservationStep;
import com.potato.reservation.stage.dto.ReservationParam;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReservationStage {

    private final AskRepository askRepository;

    public boolean check(ReservationParam reservationParam) {

        Ask ask = askRepository.findByBasketUuidAndPayStatus(
                reservationParam.getBasketUuid(),
                PayStatus.SUCCESS
        );

        if (ObjectUtils.isNotEmpty(ask)) {
            // throw new Exception();
        }

        reservationParam.setReservationStep(ReservationStep.REQUEST_PAY);
        return true;
    }


}
