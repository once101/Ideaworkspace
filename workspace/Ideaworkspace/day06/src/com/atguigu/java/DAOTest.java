package com.atguigu.java;

import java.util.List;

public class DAOTest {

    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("12312",new User(1001,34,"周杰伦"));
        dao.save("12313",new User(1002,20,"周杰"));
        dao.save("12314",new User(1003,35,"周伦"));

        dao.update("12312",new User(1004,25,"撒旦"));

        List<User> list = dao.list();
        System.out.println(list);
    }
}
