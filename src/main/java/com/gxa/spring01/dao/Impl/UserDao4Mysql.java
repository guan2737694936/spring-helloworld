package com.gxa.spring01.dao.Impl;

import com.gxa.spring01.dao.UserDao;
import com.gxa.spring01.entity.User;

import java.util.List;

public class UserDao4Mysql implements UserDao {

    @Override
    public List<User> queryByPage(Integer currentPage) {
        System.out.println("UserDao 使用 mysql中的limit 分页查询");
        return null;
    }
}
