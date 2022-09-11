//package com.hspedu.furns.web;
//
//import com.hspedu.furns.entity.Member;
//import com.hspedu.furns.service.MemberService;
//import com.hspedu.furns.service.impl.MemberServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class LoginServlet extends HttpServlet {
//
//    private MemberService memberService=new MemberServiceImpl();
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        if (memberService.login(new Member(
//                null, username, password, null
//        ))==null){
//            //用户不在DB
//            //   System.out.println(username+" "+password+"登录失败，爬");
//
//            request.setAttribute("msg","用户名或密码错误");request.setAttribute("username",username);
//
//            request.getRequestDispatcher("/views/member/login.jsp")
//                    .forward(request,response);
//
//
//
//
//        }else {
//            //     System.out.println("登录成功");
//            request.getRequestDispatcher("/views/member/login_ok.html")
//                    .forward(request,response);
//
//        }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req,resp);
//    }
//}
