package com.hspedu.furns.dao;

import com.hspedu.furns.entity.Member;

public interface MemberDao{

    //自己分析应该设置什么方法
    //提供一个通过用户名，返回对应的Member
    public Member queryMemberByUsername(String username);

    //保存一个 Member到DB 的方法
    public int saveMember(Member member);

    // 登陆操作 根据输入的用户名和密码返回DB里的用户
    public Member queryMemberByUsernameAndPassword
    (String username,String password);


}
