package com.hspedu.furns.dao.impl;

import com.hspedu.furns.dao.AdminDAO;
import com.hspedu.furns.dao.BasicDAO;
import com.hspedu.furns.entity.Adminer;

public class AdminDAOImpl extends BasicDAO<Adminer> implements AdminDAO  {
    @Override
    public boolean Login(String username, int password) {
        return querySingle("select * from `adminer` where `username`=? and " +
                "password=? ",Adminer.class,username,password)!=null;
    }
}
