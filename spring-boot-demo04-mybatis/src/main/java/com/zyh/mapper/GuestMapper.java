package com.zyh.mapper;

import com.zyh.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface GuestMapper {
     @Select("select  id,name,role from Guest")
     List<Guest> getGuests();
}
