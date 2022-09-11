package com.hspedu.furns.test;

import com.hspedu.furns.entity.Member;
import com.hspedu.furns.service.MemberService;
import com.hspedu.furns.service.impl.MemberServiceImpl;
import org.junit.Test;

public class MemberServiceTest {
    private MemberService memberService=new MemberServiceImpl();


    //判断存在
    @Test
    public void isExist(){
        if (memberService.isExistUsername("admin;")){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }

    @Test
    public void login(){
        System.out.println(memberService.login(new Member(
                null,"hspedu100","114514",null
        )));
    }
}
