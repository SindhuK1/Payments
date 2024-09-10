package com.sindhu.payments.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequestDTO {
    public String OrderId;
    public Long Amount;
}
