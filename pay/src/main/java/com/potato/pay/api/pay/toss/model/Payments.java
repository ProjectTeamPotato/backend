package com.potato.pay.api.pay.toss.model;

import com.potato.pay.api.pay.toss.model.submodel.*;
import com.potato.pay.api.pay.toss.model.enumer.Method;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Payments implements MainModel{

    String version;
    String paymentKey;
    String type;
    String orderId;
    String orderName;
    String mId;
    String currency;
    Method method;
    String totalAmount;
    String balanceAmount;
    String status;
    Date requestedAt;
    Date approvedAt;
    boolean useEscrow;
    String lastTransactionKey;
    Long suppliedAmount;
    Long vat;
    boolean cultureExpense;
    Long taxFreeAmount;
    boolean isPartialCancelable;
    Card card;
    Receipt receipt;
    EasyPay easyPay;
    Failure failure;
    CashReceipt cashReceipt;
    Discount discount;

}
