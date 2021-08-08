package com.zyh.service.Impl;

import com.zyh.mapper.GuestMapper;
import com.zyh.model.Guest;
import com.zyh.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper guestMapper;
    @Override
    public List<Guest> select() {
        return guestMapper.getGuests();
    }
}
