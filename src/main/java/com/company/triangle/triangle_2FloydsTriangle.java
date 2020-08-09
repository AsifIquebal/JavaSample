package com.company.triangle;

import java.util.Scanner;

public class triangle_2FloydsTriangle 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row number: ");
		int rownum = input.nextInt();
		int x = 0 ;
		for(int i = 0; i < rownum ; i++)
		{
			for(int j = 0 ; j <= i ; j++)
			{
				x = x+1;
				System.out.print(x+" ");
			}
			System.out.println("");
		}
		input.close();
	}
}