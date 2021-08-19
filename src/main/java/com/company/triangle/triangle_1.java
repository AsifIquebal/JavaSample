package com.company.triangle;

import org.testng.annotations.Test;

import java.util.Scanner;

public class triangle_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int rownum = input.nextInt();
        for (int i = 0; i < rownum; i++) {
            int x = 0;
            for (int j = 0; j <= i; j++) {

                if (x == 0) {
                    System.out.print("1 ");
                } else if (x == 1) {
                    System.out.print("2 ");
                } else if (x == 2) {
                    System.out.print("3 ");
                } else if (x > 2) {
                    x = 0;
                    System.out.print("1 ");
                }
                x++;
            }
            System.out.println("");
        }
        input.close();
    }

    @Test
	public void equilateralTriangle01(){
    	int num = 5;
		for(int i=0; i<=num; i++)
		{
			for(int j=1; j < num-(i); j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i ; k++)
			{
				System.out.print("*");
				for(int l=0; l<k ; l+=k)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

    @Test
    public void equilateralTriangle02() {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

	/*

-----*
----* *
---* * *
--* * * *
-* * * * *


	 */

    @Test
    public void starSpace() {
        int rowCount = 1;
        for (int i = 5; i > 0; i--) {
            //Printing i spaces at the beginning of each row
            // replace - with space
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }
            //Printing * at the end of each row
            for (int j = 1; j <= rowCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    }

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
}
