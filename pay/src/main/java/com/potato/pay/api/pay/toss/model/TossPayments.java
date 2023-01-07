package com.potato.pay.api.pay.toss.model;

import com.potato.pay.api.pay.toss.model.submodel.*;
import com.potato.pay.api.pay.toss.model.enumer.Method;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
public class TossPayments implements TossModel{

    private String version;
    private String paymentKey;
    private String type;
    private String orderId;
    private String orderName;
    private String mId;
    private String currency;
    private Method method;
    private String totalAmount;
    private String balanceAmount;
    private String status;
    private Date requestedAt;
    private Date approvedAt;
    private Boolean useEscrow;
    private String lastTransactionKey;
    private Long suppliedAmount;
    private Long vat;
    private Boolean cultureExpense;
    private Long taxFreeAmount;
    private Boolean isPartialCancelable;
    private Card card;
    private Receipt receipt;
    private EasyPay easyPay;
    private Failure failure;
    private CashReceipt cashReceipt;
    private Discount discount;

}
