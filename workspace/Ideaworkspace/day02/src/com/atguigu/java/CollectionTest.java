package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(new Person("xjh",22));
        coll.add("abc");
        coll.add(new String("asd"));
        System.out.println(coll.contains(new Person("xjh",22)));
    }
}
