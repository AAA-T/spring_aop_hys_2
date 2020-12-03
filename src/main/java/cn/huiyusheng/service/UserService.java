package cn.huiyusheng.service;

import cn.huiyusheng.entity.User;

public interface UserService {
    User select(Integer id) throws Exception;

    void add(User user) throws Exception;

    void update(User user) throws Exception;

    void delete(Integer id) throws Exception;
}
