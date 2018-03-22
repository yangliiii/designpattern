package com.yangli.pattern.singleton.lazy;

/**
 * 懒汉式
 *
 * Created by lies on 2018/3/21.
 */
public class Lazy {

    // 构造方法私有化
    private Lazy(){}

    private static Lazy lazy = null;

    // 初始化
    private static Lazy getInstance(){
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
