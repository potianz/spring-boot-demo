package com.zyh.service.Impl;

import com.zyh.mapper.GuestMapper;
import com.zyh.mapper2.GuestMapper2;
import com.zyh.model.Guest;
import com.zyh.service.GuestService;
import com.zyh.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper2 guestMapper;
//    private TkGuestMapper tkGuestMapper;
    @Override
    public List<Guest> select() {
        return guestMapper.getGuests();
//        return tkGuestMapper.selectAll();
    }
}
