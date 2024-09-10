package com.sindhu.payments.controllers;

import com.sindhu.payments.dtos.PaymentRequestDTO;
import com.sindhu.payments.services.PaymentService;
import com.sindhu.payments.services.StripePaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentsController {

    PaymentService paymentService;

    @Autowired
    public paymentsController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public String createPaymentLink(@RequestBody PaymentRequestDTO paymentRequestDTO) throws StripeException {
         String url = paymentService.generatePaymentLink(
                 paymentRequestDTO.getOrderId(), paymentRequestDTO.getAmount());
         return url;
    }

//    @PostMapping("/webhook")
//    public String handlewebhooks(){
//        System.out.println("request for webhook received");
//        System.out.println("updating db...");
//        return "webhook received";
//    }
//
//    @PostMapping("/webhook")
//    public String handlewebhookssuccessful(){
//        System.out.println("webhook successful");
//        System.out.println("updating db...");
//        return "webhook completed";
//    }
}
