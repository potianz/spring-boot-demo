package com.zyh.springboot.dao;

import com.zyh.springboot.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();
    static{
        guestList.add(new Guest(0,"黄晓明","店长"));
        guestList.add(new Guest(1,"秦海璐","财务"));
        guestList.add(new Guest(2,"林述巍","总厨"));
        guestList.add(new Guest(3,"王俊凯","经理"));
        guestList.add(new Guest(4,"杨紫","前台"));

    }
    public List<Guest> list(){
        return guestList;
    }
    public void add(Guest guest){
        guestList.add(guest);
    }
}
