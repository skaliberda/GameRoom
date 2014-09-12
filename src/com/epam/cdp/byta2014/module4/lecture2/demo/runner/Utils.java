/*
package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.List;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
//import com.epam.cdp.byta2014.module4.lecture2.demo.model.Person;

public class Utils {

	public static void finadByName(String searchValue, List<Person> list) throws FindByNameException{
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
	
}


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
