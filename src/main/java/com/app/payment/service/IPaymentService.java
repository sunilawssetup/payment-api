package com.app.payment.service;

import com.app.payment.dto.PaymentDto;

import java.util.List;

public interface IPaymentService {
    public PaymentDto savePayment(PaymentDto paymentDto);
    public  List<PaymentDto> getAllOrders();
}
