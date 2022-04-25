package com.atguigu.java;

public class Test2 {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public String change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'b';
        return str;
    }

    public static void main(String[] args) {
        Test2 ex = new Test2();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}

