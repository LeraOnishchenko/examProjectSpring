package com.exam.springexamproject.repository;

import com.exam.springexamproject.model.UserBillingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBillingInfoRepo extends JpaRepository<UserBillingInfo, String> {
    UserBillingInfo getByCardInfo_EncryptedCardNumber(String encCardNumber);
    Boolean existsByCardInfo_EncryptedCardNumber(String cardNumber);
}
