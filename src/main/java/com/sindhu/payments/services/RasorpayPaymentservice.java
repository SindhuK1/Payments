package com.sindhu.payments.services;

import org.springframework.stereotype.Service;

@Service
public class RasorpayPaymentservice implements PaymentService {

    @Override
    public String generatePaymentLink(String orderId, Long amount) {
        return "";
    }

    public String getLink(String orderId, Long amount){
       return "";
    }
}
