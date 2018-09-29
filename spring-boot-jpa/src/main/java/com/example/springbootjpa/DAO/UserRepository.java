package com.example.springbootjpa.DAO;

import com.example.springbootjpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository <SysUser,Long> {

//    //
//    SysUser findByAccount(String account);
//
//
//    List<SysUser> findByNicknameStartingWithAndFansAfter(String keywords,Integer number);
//
//    SysUser findByAccountAndFans(String account,Integer fans);
//
//
//    //根据昵称查询
//    @Query("from SysUser u where u.nickName=:nickname")
//    SysUser findUser (@Param("nickname") String nickname);
//
//    //查询昵称中含有 的用户，并按照粉丝数降序排列
////    @Query("from SysUser u ")


      //根据账号精确查询用户，采用的是通过解析方法名创建查询
       SysUser findByAccount(String account);
       //根据昵称关键词查询用户，采用的是通过解析方法名创建查询
       List<SysUser> findByNicknameLike(String keywords);


    //查询昵称含有指定关键词并且按粉丝数降序排列，采用自定义的JPQL查询
    @Query("from SysUser u where u.nickname  like CONCAT('%',:nickname,'%') order by  u.fans desc ")
    List<SysUser> findUsers(@Param("nickname") String nickname);
}
