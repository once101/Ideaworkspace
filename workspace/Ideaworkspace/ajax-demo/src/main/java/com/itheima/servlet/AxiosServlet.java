package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/axiosServlet")
public class AxiosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get......");
        //1.接收请求参数
        String username = request.getParameter("username");
        System.out.println(username);
        //2.响应数据
        response.getWriter().write("hello axios~");
        StringBuffer url = request.getRequestURL();//获取URL(统一资源定位符)
        System.out.println(url.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);
        System.out.println("post......");
    }
}
