package com.app.payment.util;

import com.app.payment.dto.PaymentDto;
import com.app.payment.model.Payment;

public class PaymentMapper {
    public static  PaymentDto paymentMapByPaymetDto(Payment payment){

        PaymentDto paymentDto=new PaymentDto();
        paymentDto.setPaymentId(payment.getPaymentId());
        paymentDto.setStatus(payment.getStatus());
        paymentDto.setOrderId(payment.getOrderId());
        return paymentDto;
    }

    public static Payment paymentDtoMapByPayment(PaymentDto paymentDto){

        Payment payment=new Payment();
        payment.setPaymentId(paymentDto.getPaymentId());
        payment.setStatus(paymentDto.getStatus());
        payment.setOrderId(paymentDto.getOrderId());
        return payment;
    }
}
