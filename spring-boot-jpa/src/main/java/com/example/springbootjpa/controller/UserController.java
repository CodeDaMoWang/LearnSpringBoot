package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.SysUser;
import com.example.springbootjpa.servicce.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<SysUser> getAll() {
        return userService.getAll();
    }


    @GetMapping("/{id}")
    public SysUser getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/account")
    public SysUser getUserByAccount(@RequestParam String account) {
        return userService.getUserByAccount(account);
    }

    @GetMapping("/nickname")
    public List<SysUser> getUsersByNicknameLike(@RequestParam String keywords) {
        return userService.getUsersByNicknameLike(keywords);

    }

    @GetMapping("/order")
    public List<SysUser> getUsersOrderByFans(@RequestParam String nickname) {
        return userService.getUsersOrderByFans(nickname);
    }
}
