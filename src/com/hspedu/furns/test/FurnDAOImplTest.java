package com.hspedu.furns.test;

import com.hspedu.furns.dao.FurnDAO;
import com.hspedu.furns.dao.impl.FurnDAOImpl;
import com.hspedu.furns.entity.Furn;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class FurnDAOImplTest {
    private FurnDAO furnDAO=new FurnDAOImpl();
    @Test
    public void queryFurn(){
        List<Furn> furn = furnDAO.queryFurn();
        System.out.println(furn);
    }
    @Test
    public void add(){
        System.out.println(furnDAO.addFurn(new Furn(null,"可爱的小沙发","顺平家居",new BigDecimal("999.99"),
                100,10,"assets/images/product-image/default.jpg")));
    }
}
