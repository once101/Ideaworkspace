package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
