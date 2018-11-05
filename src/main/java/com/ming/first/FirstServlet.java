package com.ming.first;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
    
        //1.得到ServletContext对象
        ServletContext context = this.getServletContext();
        //2.得到web应用路径 : /myservlet
        String contextPath = context.getContextPath();
        System.out.println(contextPath);
        
        /**
         * 需要删除重写的doGet()、doPost()这两个方法里面的super.doGet()和super.doPost()语句
         */
        //3.应用到请求重定向
        response.sendRedirect(contextPath+"/first/Love.html");
        // response.sendRedirect(contextPath+"/aaa.jsp?ip=" + ipAddr);
        
    }
}
