package com.company.exceptions;

import org.testng.annotations.Test;
public class FinallyPrevails {

    @Test
    public void finallyTrumpsSortOf() {
        System.out.println(test());
    }

    public int printX() {
        System.out.println("X");
        return 2;
    }

    public int test() {
        try {
            return printX();
        }
        finally {
            System.out.println("finally trumps return... sort of");
        }
    }
    @Test
    public void testFinallyBlock(){
        System.out.println(demo1());
    }
    public int demo1(){
        try {
            int i = 10;
            System.out.println(i/0);
            //throw new RuntimeException();
        }finally{
            //System.out.println("Hi");
            return 12;
        }
    }
    @Test
    public void demo2(){
        try{
            System.out.println("Demo");
            System.exit(0);
        }finally {
            System.out.println("World");
        }
    }
    @Test
    public String t2(){
        try {
            int i = 10;
            System.out.println(i/0);
            //throw new RuntimeException();
        }finally{
            return "HI";

        }
    }

}
