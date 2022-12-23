package com.exam.springexamproject.dto.payment;

import lombok.Data;

@Data
public class ManualPaymentResponseDto {
    public static ManualPaymentResponseDto of(PaymentResponseDto paymentResponseDto){
        return new ManualPaymentResponseDto();
    }
}
