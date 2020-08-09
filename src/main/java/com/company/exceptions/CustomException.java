package com.company.exceptions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomException {

    @Test
    public void test1(){
        try{
            throw new Asus("Demo Exception");
        }catch (Asus asus){
            System.out.println(asus.getMessage());
        }
    }
}

class Asus extends Exception{

    public Asus(String s) {
        super(s);
    }
    // the super here calls the constructor of the Exception class
    /*public Exception(String message) {
        super(message);
    }*/
    // which in turn calls the constructor of Throwable class
    /*public Throwable(String message) {
        fillInStackTrace();
        detailMessage = message;
    }*/
    /*
    Exception()
    Exception(String message)
    Exception(String message, Throwable cause)
    Exception(Throwable cause)*/

    List<String> list = new ArrayList<>(Arrays.asList("acv","sdfsd"));

}
