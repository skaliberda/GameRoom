
package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.Comparator;
import java.util.List;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.Toy;
//import com.epam.cdp.byta2014.module4.lecture2.demo.model.Person;

public class CustomComparator implements Comparator<Toy> {


    public int compare(Toy elem1, Toy elem2) {
        return Double.compare(elem1.getPrice(), elem2.getPrice());
    }
}




