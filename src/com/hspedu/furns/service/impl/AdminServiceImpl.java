package com.hspedu.furns.service.impl;

import com.hspedu.furns.dao.AdminDAO;
import com.hspedu.furns.dao.impl.AdminDAOImpl;
import com.hspedu.furns.service.AdminService;

public class AdminServiceImpl implements AdminService {
    private AdminDAO adminDAO=new AdminDAOImpl();
    @Override
    public boolean login(String username, int password) {
        return adminDAO.Login(username,password);
    }
}
