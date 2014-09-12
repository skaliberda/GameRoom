package com.epam.cdp.byta2014.module4.lecture2.demo.model;

/**
 * Created by Pavel on 22.08.2014.
 */

import java.util.Random;

public class Ball extends Toy {



    public Ball()

    {
        Random rand = new Random();

        price = (Math.random() * 100) + 1; //http://www.javenue.info/post/55
        color = rand.nextInt(7)+1;
        ageGroup = rand.nextInt(3)+1;
        isPlayed = Math.random() < 0.5;     //http://stackoverflow.com/questions/11468221/get-random-boolean-in-java
       //size = 1.2.3;
    }
}
