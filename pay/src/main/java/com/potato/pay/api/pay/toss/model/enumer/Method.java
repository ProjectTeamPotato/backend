package com.potato.pay.api.pay.toss.model.enumer;

import lombok.Getter;

public enum Method {

    CARD("CARD"),
    ;

    @Getter
    private String code;

    Method(String code){this.code = code;}

}
