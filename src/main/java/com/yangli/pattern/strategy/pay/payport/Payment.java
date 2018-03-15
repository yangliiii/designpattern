package com.yangli.pattern.strategy.pay.payport;

import com.yangli.pattern.strategy.pay.PayState;

/**
 * 支付渠道
 *
 * Created by lies on 2018/3/15.
 */
public interface Payment {

    public PayState pay(String uid, double amount);
}
