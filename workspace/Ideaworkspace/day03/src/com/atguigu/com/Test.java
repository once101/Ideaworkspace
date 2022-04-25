package com.atguigu.com;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Man();
        p1.run();
        p1.talk();
        p1.eat();

    if(p1 instanceof Man){
        Man m2 = (Man) p1;
     m2.Somking();
    }
    }
}
