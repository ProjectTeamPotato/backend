package com.potato.pay.controller;

import com.potato.pay.api.pay.dto.body.CreateTransactionBody;
import com.potato.pay.api.pay.dto.response.PayResponse;
import com.potato.pay.constant.PayControllerConstant;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Pay", description = "Pay")
@RestController
@RequestMapping(PayControllerConstant.PAY_API)
@RequiredArgsConstructor
public class PayController {

    @GetMapping("/{payId}")
    public PayResponse getPay(@PathVariable("payId") Long payId) {
        return new PayResponse();
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
