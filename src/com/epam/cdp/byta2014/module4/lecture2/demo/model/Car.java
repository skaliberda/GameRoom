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
        Random rand = new Random();

        price = (Math.random() * 100) + 1; //http://www.javenue.info/post/55
        color = rand.nextInt(7)+1;
        ageGroup = rand.nextInt(3)+1;
        isPlayed = Math.random() < 0.5;    //http://stackoverflow.com/questions/11468221/get-random-boolean-in-java
        //quantity
       // size


    }

    //quant = randomGen;           //amount of the toys in the room

}
