package com.yangli.pattern.strategy.pay.payport;

/**
 * 支付类型
 *
 * Created by lies on 2018/3/15.
 */
public enum PayType {

    ALI_PAY(new AliPay());

    private Payment payment;
    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return this.payment;
    }
}
