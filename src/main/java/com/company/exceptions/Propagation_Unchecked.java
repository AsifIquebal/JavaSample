package com.company.exceptions;

public class Propagation_Unchecked {

    public static void main(String[] args) {
        Propagation_Unchecked propagation = new Propagation_Unchecked();
        propagation.m3();
    }

    public void m1(){
        int i = 10/0;
    }

    public void m2(){
        m1();
    }

    public void m3(){
        try {
            m2();
        }catch (Exception e){
            System.out.println("Exception Handled...");
        }
    }


}
