package com.app.payment;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "PAYMENT-API",
                summary = "this is payment app for confirming order app",
                contact = @Contact(
                name = "Sunil Mane",
                email = "manesunil069@gmail.com",
                url = "http://localhost:9094/swagger-ui/index.html"
        ),
				license = @License(
						name = "Apache 2.0",
						url = "http://localhost:/order/9094"
				)
        )
)
public class PaymentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApiApplication.class, args);
    }

}
