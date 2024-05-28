package com.app.payment.controller;

import com.app.payment.dto.PaymentDto;
import com.app.payment.service.IPaymentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@Tag(
        name = "payment-controller",
        description = "here we confirm the payment of given oreder"
)
public class PaymentController {


    IPaymentService paymentServiceImpl;
    @Operation(
            summary = "save-order",
            description = "here we can save order"
    )
    @ApiResponse(
            responseCode = "201",
            description = "passing parameter and save the order",
            content = @Content(
                    schema = @Schema(implementation = PaymentDto.class)
            )
    )
    @PostMapping("/savePayment")
    public PaymentDto savePayment(PaymentDto paymentDto){
        return paymentServiceImpl.savePayment(paymentDto);
    }

}
