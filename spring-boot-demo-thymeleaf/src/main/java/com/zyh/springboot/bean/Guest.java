package com.zyh.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guest {
    private Integer id;
    private String name;
//    角色
    private String role;

}
