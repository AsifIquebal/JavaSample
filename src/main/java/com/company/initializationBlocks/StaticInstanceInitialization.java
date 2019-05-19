package com.company.initializationBlocks;

public class StaticInstanceInitialization {

    static{
        label1:{
            System.out.println("In Label 1");
        }
        label2:{
            System.out.println("In Label 2");
        }
        System.out.println("Inside Static Block");
    }

    {
        asus:{
            System.out.println("Inside asus");
        }
        System.out.println("Inside Instance Block");
    }

    public static void main(String[] args) {
        StaticInstanceInitialization t = new StaticInstanceInitialization();
    }

}
