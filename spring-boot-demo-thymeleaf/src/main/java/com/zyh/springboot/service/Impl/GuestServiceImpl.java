package com.zyh.springboot.service.Impl;

import com.zyh.springboot.bean.Guest;
import com.zyh.springboot.dao.GuestDao;
import com.zyh.springboot.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
   @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> selectList() {
        return guestDao.list();
    }
}
