package com.example.springbootjpa.servicce.impl;

import com.example.springbootjpa.DAO.UserRepository;
import com.example.springbootjpa.entity.SysUser;
import com.example.springbootjpa.servicce.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public List<SysUser> getAll() {
        return userRepository.findAll();
    }

    @Override
    public SysUser getUser(Long id) {
        return  userRepository.findById(id).get();
    }

    @Override
    public SysUser getUserByAccount(String account) {
        return  userRepository.findByAccount(account);
    }

    @Override
    public List<SysUser> getUsersByNicknameLike(String keywords) {
        return  userRepository.findByNicknameLike(keywords);
    }

    @Override
    public List<SysUser> getUsersOrderByFans(String nickname) {
        return userRepository.findUsers(nickname);
    }
}
