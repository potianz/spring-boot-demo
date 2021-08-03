package com.zyh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration声明是一个配置类  再spring中代替xml文件
 * @ConfigurationProperties(prefix = "vegetables")
 * 声明这是一个文件类  并且声明一级前缀
 * @PropertySource("")
 * 声明文件的路径
 */
@Configuration
@PropertySource("classpath:vegetables.properties")
@ConfigurationProperties(prefix = "vegetables")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;

    public VegetablesConfig() {
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpeper() {
        return greenpeper;
    }

    public void setGreenpeper(String greenpeper) {
        this.greenpeper = greenpeper;
    }
}
