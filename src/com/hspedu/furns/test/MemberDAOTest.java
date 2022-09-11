package com.hspedu.furns.test;

import com.hspedu.furns.dao.MemberDao;
import com.hspedu.furns.dao.impl.MemberDAOImpl;
import com.hspedu.furns.entity.Member;
import org.junit.Test;

public class MemberDAOTest {
  private MemberDao memberDao= new MemberDAOImpl();

  @Test
  public void  queryMemberByUserName(){
      if (memberDao.queryMemberByUsername("adminA")==null){
          System.out.println("不存在");
      }else {
          System.out.println("存在");
      }
  }

  @Test
    public void saveMember(){

      Member member = new Member
              (null, "king", "king", "king@sohu.com");

      int i = memberDao.saveMember(member);
      System.out.println(i);

  }

  @Test
    public void queryMemberByUsernameAndPassword(){

      System.out.println((memberDao.queryMemberByUsernameAndPassword(
              "hspedu100",
              "114514"
      )));

  }
}
