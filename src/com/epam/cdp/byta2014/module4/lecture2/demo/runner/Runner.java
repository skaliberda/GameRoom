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


        List toyList = new ArrayList();

        long addArray = Utils.initiateList(toyList);         // ???



        Collections.sort(toyList, new CustomComparator());          //Сортим по возрастающей по проперти цена.


        //for (int i = 1; i < 3; i++) {

        long searchArray = Utils.sout(toyList);


        //Now we take only toys which are for 1 Age Group.

        System.out.println();
        System.out.println("Now let's filter toys only from Age Group 1:");


        long deleteArray = Utils.deleteElement(toyList);

        Utils.sout(toyList);


        //}

        List toyListLinked = new LinkedList();              //Here we create same array, but Linked

        long addLinked = Utils.initiateList(toyListLinked);     //initiate Linked List and get timer from it.
        long searchLinked = Utils.countInPlay(toyListLinked);     //search in Linked list
        long deleteLinked = Utils.deleteElement(toyListLinked);     //search in Linked list

        long addDiff = addArray - addLinked;
        long searchDiff = searchArray - searchLinked;  //seachArray надо заменить на время, которое требуется чтобы поискать по Аррей листу. Видимо создать как и линкед лист. А по хорошему выдрать по время выполнения обычной процедуры(которая первый раз).!!!!!!! TODO
        long deleteDiff=deleteArray-deleteLinked;

        System.out.println("Addition in LinkedList was faster than in ArrayList by " + addDiff + "ms");
        System.out.println("Search in LinkedList was faster than in ArrayList by "+searchDiff+"ms");
        System.out.println("Deletion in LinkedList was faster than in ArrayList by "+deleteDiff+"ms");

        System.out.println("Time taken for overall execution: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

