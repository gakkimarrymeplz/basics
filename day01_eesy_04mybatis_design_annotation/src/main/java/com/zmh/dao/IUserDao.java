package com.zmh.dao;

import com.zmh.domain.User;
import com.zmh.mybatis.annotation.Select;

import java.util.List;


public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
