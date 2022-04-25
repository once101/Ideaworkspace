package com.atguigu.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClassLoaderTest {
    @Test
    public void test() throws IOException {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("src\\jdbc.properties");
        pros.load(fis);

        String user = pros.getProperty("user");
        String psw = pros.getProperty("password");

        System.out.println("user=" + user +",password=" + psw);

    }
}
