package com.zyh.controller;

import com.zyh.config.FoodCofig;
import com.zyh.domin.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @Autowired
    private FoodCofig foodCofig;

    @RequestMapping("/food")
    public Food food(){
        Food food = new Food();
        food.setMeat(foodCofig.getMeat());
        food.setRice(foodCofig.getRice());
        return food;
    }



}
