package com.potato.pay.api.toss;

public class TossApiConstants {

    // 유틸리티 클래스는 생성되면 안됨
    private TossApiConstants() {
        throw new IllegalStateException("Constants Class");
    }
    private static final String TOSS = "https://api.tosspayments.com/";
    private static final String V1 = "v1/";
    private static final String NOW_VERSION = V1;
    public static final String TOSS_API = TOSS + NOW_VERSION;


    // -------------------- API LIST --------------------------- //

    public static final  String CREATE_PAY = "payments";

}
