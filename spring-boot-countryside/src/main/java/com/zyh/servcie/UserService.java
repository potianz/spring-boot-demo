package com.zyh.servcie;

import com.zyh.bean.User;

public interface UserService {
    User login(String name,String password);
    int register(User user);
}
