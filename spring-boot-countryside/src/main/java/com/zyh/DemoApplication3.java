package com.zyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyh.mapper")
public class DemoApplication3 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication3.class, args);
    }

}
