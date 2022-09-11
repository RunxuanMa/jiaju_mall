package com.hspedu.furns.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class BasicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        //使用反射，获取到当前对象的方法
        // this 就是请求的 servlet
     //   System.out.println("this="+this);

        /**
         * getDeclaredMethod 方法：
         *
         *   利用反射机制 给出 .Class 以及 想得到的函数的 参数的反射 及其 名称 来得到对应的函数
         *
         */
        try {
            Method declaredMethod = this.getClass().getDeclaredMethod(action,
                    HttpServletRequest.class, HttpServletResponse.class);
     //       System.out.println(declaredMethod);

            // 利用反射调用对应的方法
            declaredMethod.invoke(this,req,resp);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
