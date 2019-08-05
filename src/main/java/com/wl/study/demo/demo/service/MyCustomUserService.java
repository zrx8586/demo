package com.wl.study.demo.demo.service;

import com.wl.study.demo.demo.model.MyUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: Wang Long
 * @create: 2019-08-05
 **/

@Component
public class MyCustomUserService implements UserDetailsService {

    /**
     * 登陆验证时，通过username获取用户的所有权限信息
     * 并返回UserDetails放到spring的全局缓存SecurityContextHolder中，以供授权器使用
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //在这里可以自己调用数据库，对username进行查询，看看在数据库中是否存在
        MyUserDetails myUserDetail = new MyUserDetails();
        myUserDetail.setUsername(username);
        myUserDetail.setPassword("123456");
        return myUserDetail;
    }


}
