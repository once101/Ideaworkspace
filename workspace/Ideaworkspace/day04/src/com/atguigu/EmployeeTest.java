package com.atguigu;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {

    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("xjh",22,new MyDate(1999,12,16));
        Employee e2 = new Employee("asd",22,new MyDate(1956,12,16));
        Employee e3 = new Employee("fgj",22,new MyDate(1987,12,16));
        Employee e4 = new Employee("weq",22,new MyDate(1954,12,16));
        Employee e5 = new Employee("dre",22,new MyDate(1938,12,16));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
