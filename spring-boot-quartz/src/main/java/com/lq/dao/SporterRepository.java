package com.lq.dao;

import com.lq.entity.Sporter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lq on 2018/10/8.
 * 用户的Repository接口
 */
public interface SporterRepository extends JpaRepository<Sporter,String> {


    /**
     * 根据账号密码来查找个人信息
     * @param account
     * @param password
     * @return
     */
    Sporter findByAccountAndPassword(String account,String password);

}
