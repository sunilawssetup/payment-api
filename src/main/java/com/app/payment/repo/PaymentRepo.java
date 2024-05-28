package com.app.payment.repo;

import com.app.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
