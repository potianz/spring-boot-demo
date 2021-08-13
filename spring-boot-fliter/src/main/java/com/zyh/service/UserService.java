package com.zyh.service;

import com.zyh.bean.User;

public interface UserService {
    User get(int id);
    void insert(User user);
}
