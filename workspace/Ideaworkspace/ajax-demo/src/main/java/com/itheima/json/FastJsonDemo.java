package com.itheima.json;

import com.alibaba.fastjson.JSON;

public class FastJsonDemo {
    public static void main(String[] args) {
        //1.将java对象转换为JSON字符串
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("123");

        String s = JSON.toJSONString(user);
        System.out.println(s);

        //2.将JSON字符串转为java对象
        User user1 = JSON.parseObject("{\"id\":1,\"password\":\"123\",\"username\":\"张三\"}", User.class);
        System.out.println(user1);
    }
}
