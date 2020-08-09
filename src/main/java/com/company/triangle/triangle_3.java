package com.company.triangle;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class triangle_3 {
	public static void main ( String arg[] )
	{
		InputStreamReader istream = new InputStreamReader(System.in) ;
		BufferedReader read = new BufferedReader(istream) ;
		System.out.print("Enter Triangle Size : ");
		int num=0;
		try{
			num=Integer.parseInt( read.readLine() );
		} catch(Exception Number){
			System.out.println("Invalid Number!");
		}

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
}