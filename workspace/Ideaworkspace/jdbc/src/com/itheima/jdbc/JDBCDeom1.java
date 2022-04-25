package com.itheima.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeom1 {
    @Test
   public void test1() throws Exception{
        //1.注册驱动
        // Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db_shopping";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.定义SQL语句
        String sql = "insert into account(name,money) VALUES ('七五',5400);";
        //4.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        //5.执行SQL
        int count = stmt.executeUpdate(sql);//受影响的行数
        //6.处理结果
        //System.out.println(count);
        if (count >0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        //7.释放资源
        stmt.close();
        conn.close();
   }
}
