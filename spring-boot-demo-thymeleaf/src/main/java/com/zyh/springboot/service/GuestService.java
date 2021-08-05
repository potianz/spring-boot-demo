package com.zyh.springboot.service;

import com.zyh.springboot.bean.Guest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GuestService {
    List<Guest> selectList();
}

