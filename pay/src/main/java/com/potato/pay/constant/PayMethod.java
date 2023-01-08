package com.potato.pay.constant;

import com.potato.pay.api.pay.toss.model.enumer.TossMethod;
import lombok.Getter;

public enum PayMethod {

    CARD("CARD"),
    ;

    @Getter
    private String method;

    PayMethod(String method) {this.method = method;}

    public TossMethod convertToTossMethod() {

        switch (valueOf(this.method)) {
            case CARD :
                return TossMethod.CARD;
            default:
                // throw new Exception()
        }

        return null;
    }

}
