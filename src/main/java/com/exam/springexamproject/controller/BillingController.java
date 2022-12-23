package com.exam.springexamproject.controller;

import com.exam.springexamproject.dto.billingInfo.UserBillingInfoCreationRequestDto;
import com.exam.springexamproject.dto.billingInfo.UserBillingInfoCreationResponseDto;
import com.exam.springexamproject.dto.billingInfo.UserBillingInfoDeleteDto;
import com.exam.springexamproject.dto.payment.ManualPaymentRequestDto;
import com.exam.springexamproject.dto.payment.ManualPaymentResponseDto;
import com.exam.springexamproject.service.CardInfoService;
import com.exam.springexamproject.service.PaymentService;
import com.exam.springexamproject.service.UserBillingInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/billing/")
public class BillingController {
    private final UserBillingInfoService userBillingInfoService;
    private final CardInfoService cardInfoService;
    private final PaymentService paymentService;

    @PostMapping("/info")
    public UserBillingInfoCreationResponseDto createUser(@RequestBody UserBillingInfoCreationRequestDto userBillingInfoCreationRequestDto){
        userBillingInfoService.validateBillingInfo(userBillingInfoCreationRequestDto);
        cardInfoService.validateCardInfo(userBillingInfoCreationRequestDto);
        return userBillingInfoService.createUserBillingInfo(userBillingInfoCreationRequestDto);
    }

    @DeleteMapping("/delete")
    public UserBillingInfoDeleteDto deleteUser(@RequestBody UserBillingInfoDeleteDto userBillingInfoDeleteDto){
        userBillingInfoService.deleteUserBillingInfo(userBillingInfoDeleteDto);
        return userBillingInfoDeleteDto;
    }

    @PostMapping
    public ManualPaymentResponseDto deleteUser(@RequestBody ManualPaymentRequestDto manualPaymentRequestDto){
        return ManualPaymentResponseDto.of
                (paymentService.makePayment(paymentService.createPaymentRequest(manualPaymentRequestDto)));
    }
}
