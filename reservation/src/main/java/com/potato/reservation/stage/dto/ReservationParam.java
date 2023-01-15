package com.potato.reservation.stage.dto;

import com.potato.reservation.constant.PayMethod;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
public class ReservationParam extends StepHead{

    private Long userId;
    private UUID basketUuid;
    private Long couponId;
    private PayMethod payMethod;

    /**
     * Optional
     */
    private Long askId;

}
