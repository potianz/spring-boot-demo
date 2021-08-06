package com.example.demo.service.Impl;

import com.example.demo.bean.Guest;
import com.example.demo.dao.GuestDao;
import com.example.demo.service.GuestService;
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

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        List<Guest> guests = guestDao.list();
        int num = this.get(guest.getId());
        if(num==-1){
//            return ;
        }else{
            guests.get(num).setName(guest.getName());
            guests.get(num).setRole(guest.getRole());
        }
        return;
    }

    @Override
    public void delete(Integer id){
        List<Guest> guests = guestDao.list();
        Guest guest = new Guest(id,"","");
        int num = this.get(id);
        if(num==-1){
            return ;
        }else{
            guests.remove(num);
        }
        return;
    }

//该方法是判断一个id和列表中的id是否一致，如果一致就会返回在列表中的index如果不是就会返回-1
    public int get(Integer id) {
        List<Guest> guests = guestDao.list();
        int i= -1;
        boolean b  = false;
       for(Guest guest1:guests){
           i++;
           if(guest1.getId()==id){
               b = true;
               break;
           }
       }
       if(b){
           return i;
       }else{
           return -1;
       }
    }
}
