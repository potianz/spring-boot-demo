package com.zyh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

@Configuration
@ConfigurationProperties(prefix = "meat")
@PropertySource("classpath:meat.properties")
public class MeatConfig {
    private String beef;
    private String chicken;
    private String fish;
    private String pork;

    public MeatConfig() {
    }

    public String getBeef() {
        return beef;
    }

    public void setBeef(String beef) {
        this.beef = beef;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getPork() {
        return pork;
    }

    public void setPork(String pork) {
        this.pork = pork;
    }
}
