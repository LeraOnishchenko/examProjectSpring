package com.exam.springexamproject.model.enums;

public enum BillingPeriod {
    annually(12),monthly(1);

    private int maxNotPayedPayments;

    private BillingPeriod(int maxNotPayedPayments) {
        this.maxNotPayedPayments = maxNotPayedPayments;
    }


    public int getMaxNotPayedPayments() {
        return maxNotPayedPayments;
    }
}
