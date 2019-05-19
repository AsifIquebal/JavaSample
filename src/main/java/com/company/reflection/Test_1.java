package com.company.reflection;

/**
 * Created by user on 06-Jan-17.
 */
class Simple{}

class Test_1{
    public static void main(String args[]) throws ClassNotFoundException {
        Class c = Class.forName("Simple");
        System.out.println(c.getName());
    }
}
