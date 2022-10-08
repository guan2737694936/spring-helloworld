package com.gxa.spring01.dao.Impl;

import com.gxa.spring01.dao.UserDao;
import com.gxa.spring01.entity.User;

import java.util.List;

public class UserDao4Oracle implements UserDao {

    @Override
    public List<User> queryByPage(Integer currentPage) {
        System.out.println("UserDao 使用 oracle中的rownum 分页查询");
        return null;
    }
}
