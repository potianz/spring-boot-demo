package com.zyh.service.Impl;

import com.zyh.bean.User;
import com.zyh.mapper.UserMapper;
import com.zyh.service.UserService;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service()
public class UserImpl implements UserService {

    @Autowired
    private BasicTextEncryptor textEncryptor;
    @Autowired
    private UserMapper mapper;
    @Override
    public User get(int id) {
         User user =  mapper.selectById(id);
        user.setName(textEncryptor.decrypt(user.getName()));
        user.setPassword(textEncryptor.decrypt(user.getPassword()));
        return user;
    }

    @Override
    public void insert(User user) {
        mapper.insert(user);
    }


}
