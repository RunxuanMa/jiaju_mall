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
//public class RegisterServlet extends HttpServlet {
//
//    private MemberService memberService=new MemberServiceImpl();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("被调用");
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");
//
//        //判断用户名是否可用
//
//        if (!memberService.isExistUsername(username)){
//            //不存在，则注册
//            System.out.println("用户名"+username+"不存在，可以注册");
//            Member member = new Member(null, username, password, email);
//
//
//            //注册
//            if (memberService.registerMember(member)){
//            //    System.out.println("注册成功");
//
//                //请求转发
//                request.getRequestDispatcher("/views/member/register_ok.html")
//                .forward(request, response);
//
//
//            }else {
//
//                request.getRequestDispatcher("/views/member/register_fail.html")
//                .forward(request,response);
//
//            //    System.out.println("注册失败");
//            }
//
//
//        }else {
//            //返回注册页面
//            request.getRequestDispatcher("/views/member/login.jsp")
//                    .forward(request,response);
//            System.out.println("用户名"+username+"存在，不能注册");
//        }
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req,resp);
//    }
//}
