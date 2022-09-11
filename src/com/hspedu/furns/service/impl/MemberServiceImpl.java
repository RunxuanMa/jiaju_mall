package com.hspedu.furns.service.impl;

import com.hspedu.furns.dao.MemberDao;
import com.hspedu.furns.dao.impl.MemberDAOImpl;
import com.hspedu.furns.entity.Member;
import com.hspedu.furns.service.MemberService;

public class MemberServiceImpl implements MemberService {
    private MemberDao memberDao=new MemberDAOImpl();
    // 注册
    @Override
    public boolean registerMember(Member member) {
        return memberDao.saveMember(member) == 1;
    }

    @Override
    public boolean isExistUsername(String username) {
        return memberDao.queryMemberByUsername(username) != null;
    }

    /**
     *
     * @param member  web 界面传入的 member对象
     * @return  DB 对应的 member对象
     *
     * ps : 用 member 是为了增强 扩展性
     */
    @Override
    public Member login(Member member) {
        return memberDao.queryMemberByUsernameAndPassword(
                member.getUsername(),
                member.getPassword());
    }


}
