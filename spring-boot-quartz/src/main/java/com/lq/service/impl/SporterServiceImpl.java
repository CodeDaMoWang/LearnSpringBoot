package com.lq.service.impl;

import com.lq.dao.SporterRepository;
import com.lq.entity.Sporter;
import com.lq.service.SporterService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lq on 2018/10/8.
 * 用户service接口的实现类
 */
@Service
public class SporterServiceImpl implements SporterService {
    @Resource
    private SporterRepository sporterRepository;

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    @Override
    public Sporter login(String account, String password) {
        return sporterRepository.findByAccountAndPassword(account,password);
    }


    /**
     * 查找所有的用户
     * @return
     */
    @Override
    public List<Sporter> findAll() {
        return sporterRepository.findAll();
    }


}
