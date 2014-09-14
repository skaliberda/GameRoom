package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Scanner;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.*;
//import com.sun.java.util.jar.pack.Instruction;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Runner {


    public static void main(String[] args) {

        int numberInPlay;
        boolean repeat = true;

		/*Car car;
        Ball ball = new Ball();
        Cubic cubic = new Cubic();
        Doll doll = new Doll();*/

        List<Toy> toyList = new ArrayList<>();

//        for (Toy elem : toyList) {                            //Заполняем коллекцию рандомным количеством объектов-игрушек.
        int carsAmount = (int) ((Math.random() * 50) + 1);
        for (int i = 1; i < carsAmount; i++) {
            toyList.add(new Car());
        }

        int ballsAmount = (int) ((Math.random() * 50) + 1);
        for (int i = 1; i < ballsAmount; i++) {
            toyList.add(new Ball());
        }

        int dollsAmount = (int) ((Math.random() * 50) + 1);
        for (int i = 1; i < dollsAmount; i++) {
            toyList.add(new Cubic());
        }

        int cubicsAmount = (int) ((Math.random() * 50) + 1);
        for (int i = 1; i < cubicsAmount; i++) {
            toyList.add(new Doll());
        }

        // }
        // public static void shuffle(List<?> toyList){   } тут мне надо его перемешать, эррейлист
        for (int i = 1; i < 3; i++) {
            carsAmount = 0;
            ballsAmount = 0;
            dollsAmount = 0;
            cubicsAmount = 0;
            numberInPlay = 0;

            for (Toy elem : toyList) {

                if (elem instanceof Car) {
                    carsAmount++;
                }
                if (elem instanceof Ball) {
                    ballsAmount++;
                }
                if (elem instanceof Doll) {
                    dollsAmount++;
                }
                if (elem instanceof Cubic) {
                    cubicsAmount++;
                }
                if (elem.getPlayed()) {
                    numberInPlay++;
                }
            }



            System.out.print("Cars: " + carsAmount);
            System.out.print("    Balls: " + ballsAmount);
            System.out.print("    Dolls: " + dollsAmount);
            System.out.println("    Cubics: " + cubicsAmount);
            System.out.println("Here are the prices of " + toyList.size() + " toys in the room:");

            System.out.print("Prices are: ");
            for (Toy elem : toyList) {


                String s = "$" + String.format("%1.2f", elem.getPrice());  //вот тут я по идее не знаю, что это за класс. И надо либо делать GetClass, либо использовать Generics.
                System.out.print(s + " ");  //Надо вывести какую-то дефолтную характеристику подкласса игрушки.
            }
            System.out.println();
            System.out.println("Amongst them in play - " + numberInPlay);


            //Now we take only toys which are for 1 Age Group.
            if (i == 1) {
                System.out.println();
                System.out.println("Now let's filter toys only from Age Group 1:");


                for (Iterator<Toy> iter = toyList.iterator(); iter.hasNext(); ) {
                    Toy elem = iter.next();
                    if (elem.getAgeGroup() != 1) {
                        iter.remove();
                    }
                }
            }

        }
    }
}

//Сделать нормальную сортировку.
//Экспешны и поиграться с timer и типами коллекций.