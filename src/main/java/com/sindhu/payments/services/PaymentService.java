package com.sindhu.payments.services;

import com.stripe.exception.StripeException;

public interface PaymentService {
    String generatePaymentLink(String orderId, Long amount) throws StripeException;
}
