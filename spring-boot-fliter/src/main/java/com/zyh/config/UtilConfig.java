package com.zyh.config;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfig {

    @Bean
    public BasicTextEncryptor getBasicTextEncryptor(){
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("G0CvDz7oJn6");
        return  textEncryptor;
    }

}
