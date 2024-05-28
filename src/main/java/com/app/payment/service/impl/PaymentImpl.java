package com.app.payment.service.impl;

import com.app.payment.dto.PaymentDto;
import com.app.payment.repo.PaymentRepo;
import com.app.payment.service.IPaymentService;
import com.app.payment.util.PaymentMapper;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl implements IPaymentService {

    private PaymentRepo paymentRepo;

    @Override
    public PaymentDto savePayment(PaymentDto paymentDto) {
        return PaymentMapper.paymentMapByPaymetDto( paymentRepo.save(PaymentMapper.paymentDtoMapByPayment(paymentDto)));
    }
}
