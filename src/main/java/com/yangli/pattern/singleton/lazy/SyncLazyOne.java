package com.yangli.pattern.singleton.lazy;

/**
 * Created by lies on 2018/3/21.
 */
public class SyncLazyOne {

    private SyncLazyOne(){}

    private static SyncLazyOne syncLazyOne = null;

    private static SyncLazyOne getInstance(){

        if (syncLazyOne == null){
            synchronized(SyncLazyOne.class){
                syncLazyOne = new SyncLazyOne();
            }
        }
        return syncLazyOne;
    }
}
