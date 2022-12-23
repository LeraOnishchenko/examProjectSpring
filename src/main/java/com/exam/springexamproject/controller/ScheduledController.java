package com.exam.springexamproject.controller;

import com.exam.springexamproject.dto.payment.AutomaticPaymentRequestDto;
import com.exam.springexamproject.dto.payment.AutomaticPaymentResponseDto;
import com.exam.springexamproject.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/scheduled")
public class ScheduledController {
    private final PaymentService paymentService;

    @PostMapping
    public AutomaticPaymentResponseDto makePayment(AutomaticPaymentRequestDto automaticPaymentRequestDto){
        return AutomaticPaymentResponseDto.of
                (paymentService.makePayment
                        (paymentService.createPaymentRequest(automaticPaymentRequestDto)));
    }
}
