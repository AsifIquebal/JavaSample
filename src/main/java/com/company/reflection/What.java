package com.company.reflection;

public class What {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        What what = new What();
        what.getClass().newInstance();
    }
}
