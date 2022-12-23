package com.exam.springexamproject.service;

import com.exam.springexamproject.dto.billingInfo.UserBillingInfoCreationRequestDto;
import com.exam.springexamproject.model.CardInfo;


public interface CardInfoService {
    void validateCardInfo(UserBillingInfoCreationRequestDto userBillingInfoCreationRequestDto);
    CardInfo createCardInfo(UserBillingInfoCreationRequestDto userBillingInfoCreationRequestDto);
}
