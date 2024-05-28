package com.app.payment.exception;

import com.app.payment.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class PaymentGlobalException {

    @ExceptionHandler(RuntimeException.class)
public ResponseEntity<ErrorDto> handlePaymentException(RuntimeException runtimeException, WebRequest webRequest){

    return ResponseEntity.ofNullable(ErrorDto.builder()
                    .errorTime(LocalDateTime.now())
                    .message(runtimeException.getMessage())
                    .path(webRequest.getDescription(false))
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .build());
}
}
