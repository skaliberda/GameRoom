package com.epam.cdp.byta2014.module4.lecture2.demo.model;

/**
 * Created by Pavel on 22.08.2014.
 */
public class Doll extends Toy {

    public Doll() {
        price = (Math.random() * 100) + 1;
        color = "White";
        ageGroup = 3;
        isPlayed = true;
    }
}
