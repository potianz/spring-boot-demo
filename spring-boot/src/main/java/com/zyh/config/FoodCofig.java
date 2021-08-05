package com.zyh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties(prefix = "food")
public class FoodCofig {
    private String rice;
    private String meat;
    private String flavor[];
//    public FoodCofig() {
//    }
//
//    public String getRice() {
//        return rice;
//    }
//
//    public void setRice(String rice) {
//        this.rice = rice;
//    }
//
//    public String getMeat() {
//        return meat;
//    }
//
//    public void setMeat(String meat) {
//        this.meat = meat;
//    }
}
