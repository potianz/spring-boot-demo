package com.zyh.controller;

import com.zyh.config.FoodCofig;
import com.zyh.config.MeatConfig;
import com.zyh.config.VegetablesConfig;
import com.zyh.domin.Food;
import com.zyh.domin.Meat;
import com.zyh.domin.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @Autowired
    private FoodCofig foodCofig;
    @Autowired
    private VegetablesConfig vegetablesConfig;

    @Autowired
    private MeatConfig meatConfig;
    @RequestMapping("/food")
    public Food food(){
        Food food = new Food();
        food.setMeat(foodCofig.getMeat());
        food.setRice(foodCofig.getRice());
        food.setFlavor(foodCofig.getFlavor());
        return food;
    }
    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        vegetables.setPotato(vegetablesConfig.getPotato());
        return vegetables;
    }
    @RequestMapping("/meat")
    public Meat meat(){
        Meat meat = new Meat();
        meat.setBeef(meatConfig.getBeef());
        meat.setChicken(meatConfig.getChicken());
        meat.setFish(meatConfig.getFish());
        meat.setPork(meatConfig.getPork());
        return meat;
    }
    @Value("${info.username}")
    private String name;
    @Value("${info.password}")
    private String password;
    @RequestMapping("/jasypt")
    public String jasypt(){
        return name+"\t"+password;
    }
}
