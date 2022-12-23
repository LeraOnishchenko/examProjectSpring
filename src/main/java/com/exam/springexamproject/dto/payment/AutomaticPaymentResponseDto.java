package com.exam.springexamproject.dto.payment;

import com.exam.springexamproject.dto.enums.PaymentResponseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutomaticPaymentResponseDto {
    private String cardNumber;
    private PaymentResponseType paymentResponseType;

    public static AutomaticPaymentResponseDto of(PaymentResponseDto paymentResponseDto){
        return new AutomaticPaymentResponseDto();
    }
}
