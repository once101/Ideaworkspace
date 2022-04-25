package com.atguigu.java;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\workspace\\Ideaworkspace\\day07\\he.txt");

        System.out.println(file1);
        System.out.println(file2);



    }

}
