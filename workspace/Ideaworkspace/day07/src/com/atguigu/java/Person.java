package com.atguigu.java;

import java.io.Serializable;
    /*
    Person需要满足如下的需求，方可序列化
    1.需要实现接口：Serializable
    2.当前类提供一个全局常量：serialVersionUID
    */

public class Person implements Serializable {

   public static final long serialVersionUID = 4231432425435534532L;

    private  String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
