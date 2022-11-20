package com.potato.pay.api.toss.model.submodel;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Card {

    Long amount;
    String number;
    Integer installmentPlanMonths;
    String approveNo;
    boolean useCardPoint;
    String cardType;
    String ownerType;
    String acquireStatus;
    boolean isInterestFree;
    String interestPayer;

}
