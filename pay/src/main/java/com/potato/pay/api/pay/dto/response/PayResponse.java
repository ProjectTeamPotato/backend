package com.potato.pay.api.pay.dto.response;

import com.potato.pay.constant.ResponseCode;
import com.potato.pay.model.entity.Pay;
import lombok.*;
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
