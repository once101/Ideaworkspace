package com.itheima.jdbc;

import com.itheima.pojo.Account;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDeom2 {
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
        String sql = "select * from account ";
        //4.获取statement对象
        Statement stmt = conn.createStatement();
        //5.执行SQL
        ResultSet rst = stmt.executeQuery(sql);
        //6.处理结果,遍历rst中的所有数据
        //6.1光标向下移动一行，并且判断当前行是否有数据
        while (rst.next()){
            //6.2获取数据 getXxx()
            int id = rst.getInt("id");
            String name = rst.getString("name");
            double money = rst.getDouble("money");

            System.out.println(id);
            System.out.println(name);
            System.out.println(money);

            System.out.println("-------------");
        }
        //7.释放资源
        rst.close();
        stmt.close();
        conn.close();

    }


    //查询account账户表数据，封装为Account对象中，并存储到ArrayList集合中
    @Test
    public void test2() throws Exception{
        //1.注册驱动
        // Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db_shopping";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.定义SQL语句
        String sql = "select * from account ";
        //4.获取statement对象
        Statement stmt = conn.createStatement();
        //5.执行SQL
        ResultSet rst = stmt.executeQuery(sql);

        //创建集合
        List<Account> list = new ArrayList<>();

        //6.光标向下移动一行，并且判断当前行是否有数据
        while (rst.next()){

            Account account = new Account();
            //6.2获取数据 getXxx()
            int id = rst.getInt("id");
            String name = rst.getString("name");
            double money = rst.getDouble("money");

            account.setId(id);
            account.setName(name);
            account.setMoney(money);

            //存入集合
            list.add(account);
        }

        System.out.println(list);
        //7.释放资源
        rst.close();
        stmt.close();
        conn.close();

    }
}
