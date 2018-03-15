package com.yangli.pattern.strategy.pay;

import com.yangli.pattern.strategy.pay.payport.PayType;

/**
 * Created by lies on 2018/3/15.
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","1234567890",23.3);
        PayState payState = order.pay(PayType.ALI_PAY);
        System.out.println(payState);
    }
}
