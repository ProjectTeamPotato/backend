package com.potato.reservation.service;

import com.potato.reservation.stage.constant.ReservationStep;
import com.potato.reservation.stage.dto.ReservationParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class ReservationStageHandler {

    private final ReservationStageCaller reservationStageCaller;

    public boolean reservationHandle(ReservationParam reservationParam) {

        boolean result = reservationStageCaller.stageCall(reservationParam);

        if (ReservationStep.STAGE_COMPLETE.equals(reservationParam.getReservationStep())) {
            return true;
        }

        if (result) {
            reservationStageCaller.nextStagePublish(reservationParam);
            return true;
        } else {
            log.error("ERROR");
            return false;
        }
    }

}
