package com.app.payment.service.impl;

import com.app.payment.dto.PaymentDto;
import com.app.payment.repo.PaymentRepo;
import com.app.payment.service.IPaymentService;
import com.app.payment.util.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentImpl implements IPaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public PaymentDto savePayment(PaymentDto paymentDto) {
        return PaymentMapper.paymentMapByPaymetDto( paymentRepo.save(PaymentMapper.paymentDtoMapByPayment(paymentDto)));
    }

    @Override
    public List<PaymentDto> getAllOrders() {
        return paymentRepo.findAll().stream().map(payment -> PaymentMapper.paymentMapByPaymetDto(payment)).collect(Collectors.toList());
    }
}
