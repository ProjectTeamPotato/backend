package com.potato.reservation.stage.dto;

import com.potato.reservation.stage.constant.ReservationStep;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class StepHead {
    private ReservationStep reservationStep;

}
