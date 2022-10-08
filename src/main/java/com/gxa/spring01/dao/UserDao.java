package com.gxa.spring01.dao;

import com.gxa.spring01.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 分页查询
     * @param currentPage 当前页
     * @return 当前页的数据
     * mysql中的分页使用limit
     * oracle中分页使用rownum
     */
    public List<User> queryByPage(Integer currentPage);
}
