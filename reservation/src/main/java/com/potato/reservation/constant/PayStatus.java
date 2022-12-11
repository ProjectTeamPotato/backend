package com.potato.reservation.constant;

public enum PayStatus {
    INIT("INIT"),
    TRANSACTIONING("TRANSACTIONING"),
    FAIL("FAIL"),
    SUCCESS("SUCCESS"),
    ;

    private String status;

    PayStatus(String status) {this.status = status;}
}