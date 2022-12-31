package com.potato.reservation.stage.dto;

import com.potato.reservation.constant.PayMethod;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
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
