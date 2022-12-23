package com.exam.springexamproject.repository;

import com.exam.springexamproject.model.CardInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardInfoRepo extends JpaRepository<CardInfo, Long> {
    CardInfo getByEncryptedCardNumber(String cardNumber);
}
