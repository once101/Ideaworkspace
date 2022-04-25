package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeom {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db_shopping";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.定义SQL语句
        String sql = "update account set money = 2000 where id = 2";
        //4.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        //5.执行SQL
        int count = stmt.executeUpdate(sql);//受影响的行数
        //6.处理结果
        System.out.println(count);
        //7.释放资源
        stmt.close();
        conn.close();
    }
}
