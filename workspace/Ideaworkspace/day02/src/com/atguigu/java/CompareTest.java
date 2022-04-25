package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;

public class CompareTest {
    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lianxiang",33);
        arr[1] = new Goods("daier",43);
        arr[2] = new Goods("xiaomi",12);
        arr[3] = new Goods("huawei",65);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].compareTo(arr[1]));


    }
}
