package com.zyh.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyh.mapper.GuestMapper;
import com.zyh.model.Guest;
import com.zyh.service.GuestService;
//import com.zyh.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper,Guest> implements GuestService {

//    @Autowired
//    private GuestMapper guestMapper;
////    private TkGuestMapper tkGuestMapper;
//
//    @Override
//    public List<Guest> select() {
//        return guestMapper.selectList(null);
////        return tkGuestMapper.selectAll();
//    }
}
