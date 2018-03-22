package com.yangli.pattern.singleton.lazy;

/**
 * Created by lies on 2018/3/21.
 */
public class SyncLazyTwo {

    private boolean initailized = false;

    // 通过构造起来判断是否已经存在该对象的实例化
    private SyncLazyTwo(){
        synchronized (this){
            if (initailized == false) {
                initailized = !initailized;
            }else{
                throw new RuntimeException("已经存在该实例对象");
            }
        }
    }

    // 单例初始化方法
    private static final SyncLazyTwo getInstance(){
        return LazyHolder.syncLazy;
    }

    // 实际初始化

    private static class LazyHolder{
        private static final SyncLazyTwo syncLazy = new SyncLazyTwo();
    }
}