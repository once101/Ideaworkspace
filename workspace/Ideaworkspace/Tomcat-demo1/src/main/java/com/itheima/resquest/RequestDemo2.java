package com.itheima.resquest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class RequestDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...........");
        req.setCharacterEncoding("UTF-8");//设置字符输入流的编码（post请求用）
        //1.获取所有参数的Map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            System.out.print(key+"");

            //获取值
            for (String values : map.get(key)) {
                System.out.print(values + "");

            }

            System.out.println();

        }

        System.out.println("-------------------------");

        //2.根据key获取参数值，数组
        String[] hobbies = req.getParameterValues("hoppy");
        for (String hoppy : hobbies) {
            System.out.println(hoppy);
        }

        //3.根据key获取单个参数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
