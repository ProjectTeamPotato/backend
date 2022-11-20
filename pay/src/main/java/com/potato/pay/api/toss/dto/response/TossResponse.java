package com.potato.pay.api.toss.dto.response;

import com.potato.pay.api.toss.model.MainModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TossResponse {

    String code;
    String message;
    MainModel mainModel;

}
