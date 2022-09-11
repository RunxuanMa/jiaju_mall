package com.hspedu.furns.dao;

import com.hspedu.furns.entity.Furn;

import java.util.List;

public interface FurnDAO {
    /**
     *
     * @return 所有家居信息
     */
    public List<Furn>queryFurn();

    /**
     *
     * @param furn 添加家居信息
     * @return 受影响行数
     */
    public int addFurn(Furn furn);
}
