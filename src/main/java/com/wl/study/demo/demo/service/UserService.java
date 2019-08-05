package com.wl.study.demo.demo.service;

import com.wl.study.demo.demo.dao.domain.User;
import com.wl.study.demo.demo.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: Wang Long
 * @create: 2019-08-02
 **/

@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public String queryUserByUserName(String user) {
        User record = new User();
        record.setUsername(user);
        return userMapper.selectOne(record) == null ? "success" : "fail";
    }

    public String saveUser(String user, String pwd) {
        User record = new User();
        record.setUsername(user);
        record.setPassword(pwd);
        return userMapper.insert(record)== 1 ? "success" : "fail";
    }

    public String login(String username, String password) {
        boolean check;
        User record = new User();
        record.setUsername(username);
        record.setPassword(password);
        return userMapper.selectOne(record)== null ? "fail" : "success";
    }
}
