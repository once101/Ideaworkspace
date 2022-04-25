package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void test(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",321);
        map.put(444,"qwe");
        //遍历所有key集：keySet();
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历所有的value集：values()
        Collection values = map.values();
        for (Object obj : values){
            System.out.println(obj);
        }
        //遍历所有的key-value
        //entrySet();
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"-----"+entry.getValue());

        }

    }

}
