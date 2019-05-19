package com.company.exceptions;

import org.testng.annotations.Test;

public class t {

    @Test
    public String t2(){
        try {
            int i = 10;
            System.out.println(i/0);
            throw new RuntimeException();
        }finally{
            return "HI";

        }
    }

    @Test
    public void arithmeticException(){
        try {
            int i = 10;
            System.out.println(i/0);
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException occurred.");
            ex.printStackTrace();
        }
    }

    @Test
    public void nullPointerException(){
        try {
            String str = null;
            str.length();
        }catch (NullPointerException ex){
            System.out.println("NullPointerException occurred.");
            ex.printStackTrace();
        }
    }

    @Test
    public void throwNullPointerException(){
        try {
            throw new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println("NullPointerException occurred.");
        }
    }

    @Test
    public void throwNullPointerExceptionWithMessage(){
        try {
            throw new NullPointerException("Hello");
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }

    /*@Test
    public void throwNullPointerExceptionWithMessage1 throws NullPointerException(){
        try {
            throw new NullPointerException("Hello");
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }*/


}
