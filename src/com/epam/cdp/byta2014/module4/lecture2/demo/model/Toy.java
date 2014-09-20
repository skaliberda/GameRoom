package com.epam.cdp.byta2014.module4.lecture2.demo.model;

import java.util.Random;

/**
 * Created by Pavel on 22.08.2014.
 */
public abstract class Toy {

    protected boolean isPlayed = false;
    protected double price;

    protected int color;
    protected int ageGroup;

    protected int size;


    public double getPrice() {
       return price;
   }

    public boolean getPlayed() {
        return isPlayed;
    }

    public int getSize(){
        return size;
    }

    public int getColor() {
        return color;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

}