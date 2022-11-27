package com.potato.pay.controller;

import com.potato.pay.api.pay.dto.body.CreateTransactionBody;
import com.potato.pay.api.pay.dto.response.PayResponse;
import com.potato.pay.constant.PayControllerConstant;
import com.potato.pay.service.PayService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Pay", description = "Pay")
@RestController
@RequestMapping(PayControllerConstant.PAY_API)
@RequiredArgsConstructor
public class PayController {

    private final PayService payService;

    @GetMapping("/{payId}")
    public PayResponse getPay(@PathVariable("payId") Long payId) {
        return payService.getPay(payId);
    }

    // todo : transaction이랑 pay 구분해서 집어넣기
    @GetMapping("/transaction/{payId}")
    public PayResponse getTransaction(@PathVariable("payId") Long payId) {
        return payService.getTransaction(payId);
    }

    @PostMapping
    public PayResponse createTransaction(@RequestBody CreateTransactionBody createTransactionBody) {
        return new PayResponse();
    }

    @DeleteMapping("/{payId}")
    public PayResponse cancelTransaction(@PathVariable("payId") Long payId) {
        return new PayResponse();
    }

}
