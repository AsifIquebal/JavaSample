package com.company.collection;

import org.testng.annotations.Test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {


    @Test
    public void test01(){
        Vector v = new Vector();
        v.add(1);
        v.add(11);
        v.add(0);

        Enumeration e = v.elements();
        Iterator i = v.iterator();
    }

    @Test
    public void test02(){
        Vector<String> dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        Enumeration<String> days =  dayNames.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }

}
