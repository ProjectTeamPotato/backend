package com.potato.reservation.stage.constant;

import lombok.Getter;

public enum ReservationStep {

    CHECK(100),
    CREATE_ASK_ENTITY(101),
    REQUEST_PAY(102),
    SET_COMPLETE(103),
    STAGE_COMPLETE(0),
    ;

    @Getter
    private Integer step;


    ReservationStep(Integer step){this.step = step;}

}
