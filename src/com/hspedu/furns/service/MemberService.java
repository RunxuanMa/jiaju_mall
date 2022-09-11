package com.hspedu.furns.service;

import com.hspedu.furns.entity.Member;

public interface MemberService {
    //注册
    public boolean registerMember(Member member);

    //判断用户是否存在
    public boolean isExistUsername(String username);

    //登录
    public Member login(Member member);
}
