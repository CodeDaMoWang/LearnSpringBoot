package com.example.springbootjpa.servicce;

import com.example.springbootjpa.entity.SysUser;

import java.util.List;

public interface UserService {

    //
    List<SysUser> getAll();
    //
    SysUser getUser(Long id);

    SysUser getUserByAccount(String account);

    List<SysUser> getUsersByNicknameLike(String keywords);


    List<SysUser> getUsersOrderByFans(String nickname);



}
