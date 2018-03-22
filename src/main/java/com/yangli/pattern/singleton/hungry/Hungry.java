package com.yangli.pattern.singleton.hungry;

/**
 * 饿汉式
 * 类记载的时候就进行了实例化，在线程之前，因此是绝对线程安全的
 *
 * 浪费资源
 *
 * Created by lies on 2018/3/21.
 */
public class Hungry {

    // 构造方法私有化
    private Hungry(){}

    // 实例化
    private static final Hungry hungry = new Hungry();

    // 调用方法
    private static Hungry getSingleton(){
        // 返回实例
        return hungry;
    }
}
