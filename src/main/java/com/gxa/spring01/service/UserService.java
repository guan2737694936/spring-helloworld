package com.gxa.spring01.service;

import com.gxa.spring01.entity.User;

import java.util.List;

public interface UserService {
    public List<User> queryByPage(Integer currentPage);
}

