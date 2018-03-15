package com.yangli.pattern.strategy.pay.payport;

import com.yangli.pattern.strategy.pay.PayState;

/**
 * 具体的支付渠道
 *
 * Created by lies on 2018/3/15.
 */
public class AliPay implements Payment {
    public PayState pay(String uid, double amount) {
        System.out.println("使用支付寶支付！！");
        return new PayState(200, amount, "支付成功！");
    }
}
