package com.company.constructor;

public class Initials {

    int x;
    protected Initials(){
        System.out.println("Parent...");
    }

    public int Initials(){
        return x;
    }

    /*protected int Initials(){
        System.out.println("Initials method only not constructor...");
        return x;
    }*/

    public static void main(String[] args) {
        Initials initials = new Initials();

    }

}