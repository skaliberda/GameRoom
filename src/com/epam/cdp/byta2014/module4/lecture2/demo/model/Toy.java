package com.epam.cdp.byta2014.module4.lecture2.demo.model;

import java.util.Random;

/**
 * Created by Pavel on 22.08.2014.
 * tyt nado sdelat GameRoom obj1 = new doll();
 * sozdat' list obiektov i s nim rabotat'
 * po dva parametra specifi4eskoi dlya grypppu Car/doll/Cubic
 * sortirovat' to odnomy bazovomy parametry i odnomy customnomy
 */
public abstract class Toy {

    protected boolean isPlayed = false;
    protected double price;
    //protected double money = 1000;
    protected int color;
    protected int ageGroup;
    //protected int quant; //amount of the toys in the room
    protected String size;
    //protected Random randomGen = new Random();




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