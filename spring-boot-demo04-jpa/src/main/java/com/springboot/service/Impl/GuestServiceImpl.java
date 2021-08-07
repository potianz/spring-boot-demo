package com.springboot.service.Impl;

import com.springboot.bean.Guest;
import com.springboot.repository.GuestRepository;

import com.springboot.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
   @Autowired
    private GuestRepository guestRepository;

    @Override
    public List<Guest> selectList() {
        return guestRepository.findAll();
    }


}
