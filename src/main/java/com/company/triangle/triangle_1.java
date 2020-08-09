package com.company.triangle;

import org.testng.annotations.Test;

import java.util.Scanner;

public class triangle_1 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row number: ");
		int rownum = input.nextInt();
		for(int i = 0; i< rownum ; i++)
		{
			int x = 0;
			for(int j = 0 ; j<=i ; j++)
			{
				
				if(x==0)
				{
					System.out.print("1 ");
				}
				else if(x==1)
				{
					System.out.print("2 ");
				}
				else if(x==2)
				{
					System.out.print("3 ");
				}
				else if(x>2)
				{
					x=0;
					System.out.print("1 ");
				}
				x++;
			}
			System.out.println("");
		}
		input.close();
	}


	@Test
	public void starSpace1(){
		int i,j,k;
		for(i=1; i<=5; i++)
		{
			for(j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test
    public void starSpace(){
	    int rowCount = 1;
        for (int i = 5; i > 0; i--) {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
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



}