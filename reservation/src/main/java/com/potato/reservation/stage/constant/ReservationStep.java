package com.potato.reservation.stage.constant;

import lombok.Getter;

public enum ReservationStep {

    CHECK(100),
    REQUEST_PAY(101),
    SET_COMPLETE(102),
    STAGE_COMPLETE(0),
    ;

    @Getter
    private Integer step;


    ReservationStep(Integer step){this.step = step;}

}
