package com.zyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan("com.zyh.mapper")
@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.zyh.tk.mapper")
public class DemoApplicationTwo {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplicationTwo.class, args);
    }

}
