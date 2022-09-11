package com.hspedu.furns.web;

import com.hspedu.furns.entity.Furn;
import com.hspedu.furns.service.FurnService;
import com.hspedu.furns.service.impl.FurnServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;

public class FurnServlet extends BasicServlet {

    private FurnService furnService=new FurnServiceImpl();

    /**
     *  抽象类模版设计模式 + 反射 +动态绑定
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Furn> furn = furnService.queryFurn();

        req.setAttribute("furn",furn);

        req.getRequestDispatcher("/views/manager/furn_manage.jsp").forward(req,
                resp);

    }

    /**
     *  添加家居
     * @param request
     * @param response
     */
    protected void add(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{

        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        String maker = request.getParameter("maker");
        String price = request.getParameter("price");
        String sales = request.getParameter("sales");
        String stock = request.getParameter("stock");

        /**
         *  可以在这里使用正则表达式  对数据 进行校验
         */

        Furn furn=null;

//       try {
//    furn = new Furn(null, name, maker, new BigDecimal(price),
//            new Integer(sales), new Integer(stock), "assets/images/product-image/default.jpg");
//
//       }catch (Exception e){
//           request.setAttribute("msg","数据格式有误");
//
//           request.getRequestDispatcher(".....").forward(request,
//                   response);
//}

        furn = new Furn(null, name, maker, new BigDecimal(price),
                new Integer(sales), new Integer(stock), "assets/images/product-image/default.jpg");

        furnService.addFurn(furn);

        //哈哈修改完就转发
        //重定向!
        response.sendRedirect(request.getContextPath()+"" +
                "/manager/furnServlet?action=list");
    }

}
