package com.app.payment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_paymet")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long paymentId;
    public Long orderId;
    public String status;

}
