package com.epam.cdp.byta2014.module4.lecture2.demo.model;

/**
 * Created by Pavel on 22.08.2014.
 * tyt nado sdelat GameRoom obj1 = new doll();
 * sozdat' list obiektov i s nim rabotat'
 * po dva parametra specifi4eskoi dlya grypppu Car/doll/Cubic
 * sortirovat' to odnomy bazovomy parametry i odnomy customnomy
 */
public class GameRoom {

    protected float price;
    protected String color;
    protected int ageGroup;
    protected int quant; //amount of the toys in the room
    protected String size;

   public float getPrice() {
       return price;
   }

    public String getColor() {
        return color;
    }

    public int getAgeGroup() {
        return ageGroup;
    }
    public String getQuant() {
        return quant;
    }


}
