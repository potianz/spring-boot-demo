package com.example.demo.service;

import com.example.demo.bean.Guest;

import java.util.List;


public interface GuestService {
    List<Guest> selectList();
    void add(Guest guest);
    void update(Guest guest);
    void delete(Integer id);
}

