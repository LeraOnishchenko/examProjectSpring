package com.exam.springexamproject.service;

import com.exam.springexamproject.dto.payment.AutomaticPaymentRequestDto;
import com.exam.springexamproject.dto.payment.ManualPaymentRequestDto;
import com.exam.springexamproject.dto.payment.PaymentRequest;
import com.exam.springexamproject.dto.payment.PaymentResponseDto;

public interface PaymentService {
    PaymentRequest createPaymentRequest(AutomaticPaymentRequestDto automaticPaymentRequestDto);
    PaymentRequest createPaymentRequest(ManualPaymentRequestDto automaticPaymentRequestDto);

    PaymentResponseDto makePayment(PaymentRequest paymentRequestDto);
}
