package com.potato.pay.api.pay.toss.model.submodel;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Failure {

    String code;
    String message;

}
