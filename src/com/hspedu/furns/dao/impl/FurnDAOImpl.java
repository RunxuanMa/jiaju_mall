package com.hspedu.furns.dao.impl;

import com.hspedu.furns.dao.BasicDAO;
import com.hspedu.furns.dao.FurnDAO;
import com.hspedu.furns.entity.Furn;

import java.util.List;

public class FurnDAOImpl extends BasicDAO<Furn> implements FurnDAO {

    /**
     *
     * @return 查询结果
     *
     *  warning: 注意 MySQL 别名 !!! 映射失败(返回结果为 NULL)是因为反射找不到对应的
     *
     */

    @Override
    public List<Furn> queryFurn() {
        String sql="      SELECT `id`,`name`,`maker`,`price`, `sales`, `stock`,`img_path` imgPath \n" +
                "          FROM furn" ;
        return queryMulti(sql,Furn.class);
    }

    @Override
    public int addFurn(Furn furn) {
        String sql="INSERT INTO furn VALUES(NULL,?,?,?,?,?,?)";
        return update(sql,furn.getName(),furn.getMaker(),
                furn.getPrice(),furn.getSales(),furn.getStock(),furn.getImgPath()
        );
    }
}
