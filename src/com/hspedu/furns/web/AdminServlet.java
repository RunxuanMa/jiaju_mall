package com.hspedu.furns.web;

import com.hspedu.furns.service.AdminService;
import com.hspedu.furns.service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminServlet extends BasicServlet {

    private AdminService adminService=new AdminServiceImpl();

    protected void admin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        int pass=Integer.parseInt(password);

        if (adminService.login(username,pass)) {
            req.getRequestDispatcher("/views/manager/manage_menu.jsp").forward(req,
                    resp);
        }else {
            req.getRequestDispatcher("/views/manager/manage_login.jsp").forward(req,
                    resp);
        }
    }
}
