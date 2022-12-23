package com.exam.springexamproject.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CardInfo {
    @Id
    private Long id;

    @Column(name = "card_number",unique = true)
    private String encryptedCardNumber;
    @Column(name = "cardholder_name")
    private String encryptedCardHolderName;
    @Column(name = "exp_date")
    private LocalDate encryptedExpDate;
    @OneToOne
    @JoinColumn(name = "user_billing_info_id")
    private UserBillingInfo userBillingInfo;
}
