package com.gxa.spring01.service.Impl;

import com.gxa.spring01.dao.UserDao;
import com.gxa.spring01.entity.User;
import com.gxa.spring01.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao;
    @Override
    public List<User> queryByPage(Integer currentPage) {

        List<User> users = userDao.queryByPage(currentPage);
        return users;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
