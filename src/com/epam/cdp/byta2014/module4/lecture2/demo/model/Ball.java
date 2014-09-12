package com.epam.cdp.byta2014.module4.lecture2.demo.model;

/**
 * Created by Pavel on 22.08.2014.
 */


public class Ball extends Toy {

    public Ball()

    {
        price = (Math.random() * 100) + 1;
        color = "Red";
        ageGroup = 1;
        isPlayed = Math.random() < 0.5;
    }
}
