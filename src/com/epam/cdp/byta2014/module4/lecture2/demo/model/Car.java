package com.epam.cdp.byta2014.module4.lecture2.demo.model;

import java.util.Random;


/**
 * Created by Pavel on 22.08.2014.
 */
public class Car extends Toy {
//    int quantity = 10;
//    String color = "blue";
//    float price = 40;
//

    public Car() {
        price = (Math.random() * 100) + 1;       // 20;
        color = "blue";
        ageGroup = 2;
        isPlayed = Math.random() < 0.5;
        //quantity
       // size


    }

    //quant = randomGen;           //amount of the toys in the room

}
