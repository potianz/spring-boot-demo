package com.zyh.mapper2;

import com.zyh.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GuestMapper2 {
    @Select("select  id,name,role from Guest")
    List<Guest> getGuests();
}
