package com.app.payment.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PaymentDto {
    public Long paymentId;
    public Long orderId;
    public String status;
}
