package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import com.epam.cdp.byta2014.module4.lecture2.demo.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavlo_Kamyshov on 9/15/2014.
 */
public class Utils {


    static int numberInPlay = 0;


    public static long initiateList(List<Toy> toyList) {
        long startTime = System.currentTimeMillis();

        int amount = 5000;
        //int carsAmount = 5000;//(int) ((Math.random() * 50) + 1);  //рандомные числа были убраны, чтобы иметь возможность сравнивать производительность.
        for (int i = 0; i < amount; i++) {
            toyList.add(new Car());
        }

        //int ballsAmount = 5000;//(int) ((Math.random() * 50) + 1);
        for (int i = 0; i < amount; i++) {
            toyList.add(new Ball());
        }

        //int dollsAmount = 5000;//(int) ((Math.random() * 50) + 1);
        for (int i = 0; i < amount; i++) {
            toyList.add(new Cubic());
        }

        //int cubicsAmount = 5000;//(int) ((Math.random() * 50) + 1);
        for (int i = 0; i < amount; i++) {
            toyList.add(new Doll());
        }
        return System.currentTimeMillis()-startTime;

    }

    public static void sout(List<Toy> toyList){

        System.out.println("Here are the prices of " + toyList.size() + " toys in the room:");

        System.out.print("Sorted prices are: ");
        for (Toy elem : toyList) {


            String s = "$" + String.format("%1.2f", elem.getPrice());  //вот тут я по идее не знаю, что это за класс. И надо либо делать GetClass, либо использовать Generics.
            System.out.print(s + " ");  //Надо вывести какую-то дефолтную характеристику подкласса игрушки.
        }
        System.out.println();

        System.out.println("Amongst them in play - " + numberInPlay);//Utils.countInPlay(toyList));
    }

    public static long countInPlay(List<Toy> toyList){

        long startTime = System.currentTimeMillis();
        numberInPlay = 0;

        for (Toy elem : toyList) {

//                if (elem instanceof Car) {
//                    carsAmount++;
//                }
//                if (elem instanceof Ball) {
//                    ballsAmount++;
//                }
//                if (elem instanceof Doll) {
//                    dollsAmount++;
//                }
//                if (elem instanceof Cubic) {
//                    cubicsAmount++;
//                }
            if (elem.getPlayed()) {
                numberInPlay++;
            }
        }
        long searchArray = System.currentTimeMillis()-startTime;
        return searchArray;
    }

}
