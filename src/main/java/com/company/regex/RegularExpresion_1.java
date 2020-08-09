package com.company.regex;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion_1
{
	public static void main( String args[] )
	{
		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(line);

		System.out.println("Total Groups present [groupCount method]: "+m.groupCount());
		if (m.find( )) 
		{
			System.out.println("Found value: " + m.group(0) );
			System.out.println("Found value: " + m.group(1) );
			System.out.println("Found value: " + m.group(2) );

			
		} 
		else 
		{
			System.out.println("NO MATCH");
		}
	}

	@Test
    public void test2(){
	    String a = "Asif(01)";
	    String b = a.replaceAll("[^a-zA-Z]","");
        System.out.println(b);
        System.out.println("Gaurav J(01)".replaceAll("[^a-zA-Z]",""));
        System.out.println("Gaurav J(01)".replaceAll("[^a-zA-Z\\s]",""));
    }

    @Test
	public void test3(){
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher("There are more than -2 and less than 12 numbers here");
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}