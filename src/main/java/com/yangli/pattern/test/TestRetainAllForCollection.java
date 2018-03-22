package com.yangli.pattern.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lies on 2018/3/20.
 */
public class TestRetainAllForCollection {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(7);
        set.add(5);

//        list.retainAll(set);
        set.retainAll(list);

        System.out.println(set);
    }
}
