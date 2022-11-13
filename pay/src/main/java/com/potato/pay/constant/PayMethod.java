package com.potato.pay.constant;

public enum PayMethod {

    KAKAO("KAKAO"),
    TOSS("TOSS"),
    ;

    private String method;
    PayMethod(String method) {this.method = method;}

}
