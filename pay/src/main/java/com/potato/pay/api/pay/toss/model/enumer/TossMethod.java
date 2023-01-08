package com.potato.pay.api.pay.toss.model.enumer;

import lombok.Getter;

public enum TossMethod {

    CARD("CARD"),
    ;

    @Getter
    private String code;

    TossMethod(String code){this.code = code;}




}
