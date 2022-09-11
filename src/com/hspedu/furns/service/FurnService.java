package com.hspedu.furns.service;

import com.hspedu.furns.entity.Furn;

import java.util.List;

public interface FurnService {
    public List<Furn> queryFurn();

    public int addFurn(Furn furn);
}
