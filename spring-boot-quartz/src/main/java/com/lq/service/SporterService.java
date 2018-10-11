package com.lq.service;

import com.lq.entity.Sporter;


import java.util.List;

/**
 * Created by lq on 2018/10/8.
 * 用户的service接口
 */
public interface SporterService {

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    Sporter login(String account,String password);


    /**
     * 查找所有用户的信息，以及该用户下的步数信息
     * @return
     */
    List<Sporter> findAll();
}
