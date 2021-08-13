package com.zyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan
@MapperScan("com.zyh.mapper")
public class DemoApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication1.class, args);
    }

}
