package com.potato.reservation.module.dto.response;

public enum ResponseCode {

    SUCCESS("SUCCESS"),
    FAIL("FAIL"),
    ;

    private String code;

    ResponseCode(String code) {this.code = code;}
}