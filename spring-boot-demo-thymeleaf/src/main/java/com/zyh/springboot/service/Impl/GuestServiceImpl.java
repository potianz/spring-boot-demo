package com.zyh.springboot.service.Impl;

import com.zyh.springboot.bean.Guest;
import com.zyh.springboot.dao.GuestDao;
import com.zyh.springboot.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
   @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> selectList() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        List<Guest> guests = guestDao.list();
        int num = this.get(guest);
        if(num==-1){
            return ;
        }else{
            guests.get(num).setName(guest.getName());
            guests.get(num).setRole(guest.getRole());
        }
        return;
    }

    @Override
    public void delete(Guest guest) {
        List<Guest> guests = guestDao.list();
        int num = this.get(guest);
        if(num==-1){
            return ;
        }else{
            guests.remove(num);
        }
        return;
    }


    public int get(Guest guest) {
        List<Guest> guests = guestDao.list();
        int i= -1;
       for(Guest guest1:guests){
           i++;
           if(guest1.getId()==guest.getId()){
               break;
           }
       }
       return i;
    }
}
