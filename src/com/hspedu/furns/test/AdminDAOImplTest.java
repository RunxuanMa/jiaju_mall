package com.hspedu.furns.test;

import com.hspedu.furns.dao.AdminDAO;
import com.hspedu.furns.dao.impl.AdminDAOImpl;
import org.junit.Test;

public class AdminDAOImplTest {
    private AdminDAO adminDAO=new AdminDAOImpl();
    @Test
    public void test(){
        System.out.println(adminDAO.Login("hsp",12345));
    }
}
