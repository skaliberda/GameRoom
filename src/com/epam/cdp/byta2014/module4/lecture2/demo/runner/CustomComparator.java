
package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.Comparator;
import java.util.List;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.Toy;
//import com.epam.cdp.byta2014.module4.lecture2.demo.model.Person;

public class CustomComparator implements Comparator<Toy> {
    public int compare(Toy elem1, Toy elem2) {
        //Так, тут я типа имплеменчу метод compare для интерфейса, это все круто.
        //но метод campare должен возвращать int, судя по интерфейсу. а он вроде как дабл возвращает..
        // т.к. я от балды попробовал с помощью класса Double реализовать его.
        return Double.compare(elem1.getPrice(), elem2.getPrice()); //ПОчему я тут возвращаю int??? Сравнивая два дабла. Офигеть.
    }
}





    /*public static void finadByName(String searchValue, List<Person> list) throws FindByNameException{
    int counter = 0;
    for(Person child : list) {
        if(searchValue.equals(child.getFirstName())) {
            System.out.println(child.getInfo());
            counter ++;
        }
    }
    if(counter == 0) {
        throw new FindByNameException(searchValue);
    }
}

}*/


//package com.javarush.test.level02.lesson08.task01;
//
//*/
/* Минимум двух чисел
//Написать функцию, которая возвращает минимум из двух чисел.
/*/
/*//*

//public class Solution
//{
//    public static int min(int a, int b)
//    {
//        if (a<b) {
//            return a;
//        }
//        else
//            return b;
//    }*/
