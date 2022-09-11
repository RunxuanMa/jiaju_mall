package com.hspedu.furns.dao.impl;

import com.hspedu.furns.dao.BasicDAO;
import com.hspedu.furns.dao.MemberDao;
import com.hspedu.furns.entity.Member;

public class MemberDAOImpl extends BasicDAO<Member> implements MemberDao {

    /**
     *
     *
     * @param username  用户名
     * @return   对应的Member
     */

    @Override
    public Member queryMemberByUsername(String username) {

        String sql="SELECT `id` , `username`,`password`,`email` FROM `member`"+
                "WHERE `username`=?";
        return querySingle(sql, Member.class, username);
    }

    /**
     *
     *
     * @param member member对象
     * @return  受影响的行数  -1 表示失败
     */
    @Override
    public int saveMember(Member member) {
        String sql=" INSERT INTO `member` (`username`,`password`,`email`)" +
                " VALUES(?,MD5(?),?)";
        return update(sql,
                member.getUsername(),
                member.getPassword(),
                member.getEmail());
    }

    // 登陆操作 根据输入的用户名和密码返回DB里的用户

    /**
     *
     * @param username 用户名
     * @param password 密码
     * @return  对应的用户 或返回NULL
     */
    @Override
    public Member queryMemberByUsernameAndPassword(String username, String password) {

        String sql="SELECT `id` , `username`,`password`,`email` FROM `member`"+
                "WHERE `username`=?  and `password`=md5(?) ";

        return querySingle(sql,Member.class,username,password);
    }
}
