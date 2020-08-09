package com.company;

import org.testng.annotations.Test;

public class OperatorsDemo {
    int i = 10;

    public static void main(String[] args) {
        //System.out.println(this);
    }

    @Test
    public void simpleBinaryConversion(){
        System.out.println("7 in binary: " + Integer.toBinaryString(7));
        System.out.println("8 in binary: " + Integer.toBinaryString(8));
        System.out.println("6 in binary: " + Integer.toBinaryString(6));
    }

    @Test
    public void signedLeftShiftOperator(){
        int x = 4;
        System.out.println("4 in binary: " + Integer.toBinaryString(x));
        System.out.println("Left Shift by 1 position: " + x + "["+Integer.toBinaryString(x)+"] -> " +(x<<1)+"["+Integer.toBinaryString(x<<1)+"]");
    }
    @Test
    public void signedRightShiftOperator(){
        int x = 4;
        System.out.println("4 in binary: " + Integer.toBinaryString(x));
        System.out.println("Right Shift by 1 position: " + x + "["+Integer.toBinaryString(x)+"] -> " +(x>>1)+"["+Integer.toBinaryString(x>>1)+"]");
    }
    @Test
    public void signedRightShiftOperatorNegativeNumber(){
        int x = -2;
        System.out.println("-2 in binary: " + Integer.toBinaryString(x));
        System.out.println("Right Shift by 1 position: " + x + "["+Integer.toBinaryString(x)+"] -> " +(x>>1)+"["+Integer.toBinaryString(x>>1)+"]");
    }
}
