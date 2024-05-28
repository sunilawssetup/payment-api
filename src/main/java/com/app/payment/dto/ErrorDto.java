package com.app.payment.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data@Builder
public class ErrorDto {
    public String path;
    public String message;
    public HttpStatus status;
    public LocalDateTime errorTime;


}
