package com.wl.study.demo.demo.dao.domain;

import lombok.Data;

/**
 * @program: demo
 * @description: 角色
 * @author: Wang Long
 * @create: 2019-08-05
 **/


@Data
public class Role {

    private Integer id;
    private String name;


    public Role(){

    }

    public Role(String name) {
        this.name = name;
    }
}

