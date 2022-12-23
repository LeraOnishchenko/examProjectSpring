package com.exam.springexamproject.model;

import com.exam.springexamproject.model.enums.BillingPeriod;
import com.exam.springexamproject.model.enums.PaymentType;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "uuid")
public class UserBillingInfo {
    @Id
    private String uuid;
    @Column(name = "billing_period")
    @Enumerated(EnumType.STRING)
    private BillingPeriod billingPeriod;
    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @Column(name = "card_number", nullable = true)
    @OneToOne(mappedBy = "cardInfo",cascade = CascadeType.ALL,orphanRemoval = true)
    private CardInfo cardInfo;
    private int notPayedPayments;
}
