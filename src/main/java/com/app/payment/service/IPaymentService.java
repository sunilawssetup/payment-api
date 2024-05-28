package com.app.payment.service;

import com.app.payment.dto.PaymentDto;

public interface IPaymentService {
    public PaymentDto savePayment(PaymentDto paymentDto);
}
