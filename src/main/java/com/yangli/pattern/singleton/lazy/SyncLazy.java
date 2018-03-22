package com.yangli.pattern.singleton.lazy;

/**
 * Created by lies on 2018/3/21.
 */
public class SyncLazy {

    // 构造器私有化
    private SyncLazy(){}

    private static SyncLazy syncLazy = null;

    private static synchronized SyncLazy getInstance(){
        if (syncLazy == null) {
            syncLazy = new SyncLazy();
        }
        return syncLazy;
    }
}
