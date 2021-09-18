package com.company.pattern;

import org.testng.annotations.Test;

public class FloydTraingle {
    /*
        * 	1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
        * */
    @Test
    public void floydTriangle01() {
        int rownum = 5;
        int x = 0;
        for (int i = 0; i < rownum; i++) {
            for (int j = 0; j <= i; j++) {
                x = x + 1;
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }

    //*
    //**
    //***
    @Test
    public void floydTriangle02() {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    @Test
    public void reverseFlyodStar() {
        int row = 4;
        for (int i = row; i >=1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    /*
    10   9   8   7
    6   5   4
    3   2
    1
    */
    @Test
    public void reverseFloyd01(){
        int n = 4;
        int curr_val = n * (n + 1) / 2;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d  ", curr_val--);
            }
            System.out.println("");
        }
    }

    @Test
    public void reverseFloyd02(){
        int n = 4;
        int curr_val = n * (n + 1) / 2;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%2d  ", curr_val--);
            }
            n--;
            System.out.println("");
        }
    }

}
