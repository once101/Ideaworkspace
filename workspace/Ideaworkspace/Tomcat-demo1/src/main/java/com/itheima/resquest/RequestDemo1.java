package com.itheima.resquest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();//获取请求方法：GET
        System.out.println(method);
        String contextPath = req.getContextPath();//获取虚拟目录(项目访问路径)：/request-demo
        System.out.println(contextPath);
        StringBuffer url = req.getRequestURL();//获取URL(统一资源定位符)
        System.out.println(url.toString());
        String uri = req.getRequestURI();//获取URI(统一资源标识符)
        System.out.println(uri);
        String queryString = req.getQueryString();//获取请求参数(GET方式)
        System.out.println(queryString);

        String header = req.getHeader("user-agent");//获取请求头：user-agent：浏览器的版本信息
        System.out.println(header);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取post请求体：请求参数

        //1.获取字符输入流
        BufferedReader br = req.getReader();
        //2.读取数据
        String line = br.readLine();
        System.out.println(line);

    }
}
