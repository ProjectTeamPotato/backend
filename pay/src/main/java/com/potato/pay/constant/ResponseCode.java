package com.potato.pay.constant;

public enum ResponseCode {

    SUCCESS("SUCCESS"),
    FAIL("FAIL"),
    ;

    private String code;

    ResponseCode(String code) {this.code = code;}
}
