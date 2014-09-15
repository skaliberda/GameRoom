package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.*;
//import java.util.Scanner;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.*;
//import com.sun.java.util.jar.pack.Instruction;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Runner {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int numberInPlay;



        List toyList = new ArrayList();

        long addArray = Utils.initiateList(toyList);         // ???






        Collections.sort(toyList, new CustomComparator());          //Сортим по возрастающей по проперти цена.


        for (int i = 1; i < 3; i++) {
            /*carsAmount = 0;
            ballsAmount = 0;
            dollsAmount = 0;
            cubicsAmount = 0;*/

            //numberInPlay = Utils.countInPlay(toyList);
            /*numberInPlay = 0;

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
            }*/



            /*System.out.print("Cars: " + carsAmount);
            System.out.print("    Balls: " + ballsAmount);
            System.out.print("    Dolls: " + dollsAmount);
            System.out.println("    Cubics: " + cubicsAmount);*/
            /*System.out.println("Here are the prices of " + toyList.size() + " toys in the room:");

            System.out.print("Sorted prices are: ");
            for (Toy elem : toyList) {


                String s = "$" + String.format("%1.2f", elem.getPrice());  //вот тут я по идее не знаю, что это за класс. И надо либо делать GetClass, либо использовать Generics.
                System.out.print(s + " ");  //Надо вывести какую-то дефолтную характеристику подкласса игрушки.
            }
            System.out.println();
            System.out.println("Amongst them in play - " + numberInPlay);*/
            Utils.sout(toyList);


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

        List toyListLinked = new LinkedList();              //Here we create same array, but Linked

        long addLinked = Utils.initiateList(toyListLinked);     //initiate Linked List and get timer from it.
        long searchLinked = Utils.countInPlay(toyListLinked);     //search in Linked list

        long addDiff=addArray-addLinked;
        long searchDiff= searchArray - searchLinked;  //seachArray надо заменить на время, которое требуется чтобы поискать по Аррей листу. Видимо создать как и линкед лист. А по хорошему выдрать по время выполнения обычной процедуры(которая первый раз).!!!!!!! TODO
        //long deleteDiff=deleteArray-deleteLinked;

        System.out.println("Addition in LinkedList was faster than in ArrayList by "+addDiff+"ms");
        System.out.println("Search in LinkedList was faster than in ArrayList by "+searchDiff+"ms");
       // System.out.println("Deletion in LinkedList was faster than in ArrayList by "+deleteDiff+"ms");

        System.out.println("Time taken for overall execution: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

