package com.itheima.jdbc;

import org.junit.Test;

import java.sql.*;

public class JDBCDeom3 {
    @Test
   public void test1() throws Exception{
        //1.注册驱动
        // Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db_shopping";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        String name = "张三";
        String pwd = "123";

        String sql = "select * from tb_user where username = '"+name+"' and password = '"+pwd+"'";

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        rs.close();
        stmt.close();
        conn.close();
    }


    public void test2() throws Exception{
        //1.注册驱动
        // Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db_shopping?useSSL=false&useServerPrepStmts=true";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.接收用户输入的用户名和密码
        String name = "asdasdasd";
        String pwd = "' or '1' = '1";
        //4.定义sql
        String sql = "select * from tb_user where username = ? and password = ?";
        //获取prepareStatement(sql);
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //设置？的值
        pstmt.setString(1,name);
        pstmt.setString(2,pwd);
        //执行sql
        ResultSet rs = pstmt.executeQuery();
        //判断登录是否成功
        if(rs.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        //释放资源
        rs.close();
        pstmt.close();
        conn.close();


        //rs.close();
        //stmt.close();
        //conn.close();
    }
}
