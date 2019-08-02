package com.wl.study.demo.demo.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * User: wanglong
 * Date: 2019/07/18
 * 被继承的Mapper，一般业务Mapper继承它
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}