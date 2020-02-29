package com.zmh.dao;

import com.zmh.domain.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
