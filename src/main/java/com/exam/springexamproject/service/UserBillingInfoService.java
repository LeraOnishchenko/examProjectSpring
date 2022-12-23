package com.exam.springexamproject.service;

import com.exam.springexamproject.dto.billingInfo.UserBillingInfoCreationRequestDto;
import com.exam.springexamproject.dto.billingInfo.UserBillingInfoCreationResponseDto;
import com.exam.springexamproject.dto.billingInfo.UserBillingInfoDeleteDto;

public interface UserBillingInfoService {
    void validateBillingInfo(UserBillingInfoCreationRequestDto userBillingInfoCreationRequestDto);
    UserBillingInfoCreationResponseDto createUserBillingInfo(UserBillingInfoCreationRequestDto userBillingInfoCreationRequestDto);
    boolean isUserBlocked(String cardNumber);
    void deleteUserBillingInfo(UserBillingInfoDeleteDto userBillingInfoDeleteDto);
}
