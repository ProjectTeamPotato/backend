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
public class CashReceipt {

    String receiptKey;
    String type;
    Long amount;
    Long taxFreeAmount;
    String issueNumber;
    String receiptUrl;

}
