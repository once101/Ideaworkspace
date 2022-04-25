package com.itheima.respone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/resp1")
public class Respons extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resp1.......");
//
//        //重定向
//        //1.设置响应状态码302
//        resp.setStatus(302);
//        //2.设置响应头Location
//        resp.setHeader("Location","/Tomcat_demo1_war/resp2");

        resp.sendRedirect("/Tomcat_demo1_war/resp2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req,resp);

    }
}
