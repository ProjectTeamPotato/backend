package com.potato.reservation.module.dto.response;

import com.potato.reservation.model.entity.Pay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class PayResponse {

    private Pay pay;
    private ResponseCode responseCode;

}