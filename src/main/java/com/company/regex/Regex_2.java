package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_2 {

	public static void main(String[] args) {
		String onlineBillsay="Bill successfully sent to Treasury. Token No generated is 386";
		String pattern = "(\\d+)";
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		Pattern r1= Pattern.compile(pattern, 0);
		// Now create matcher object.
		Matcher m = r.matcher(onlineBillsay);
		Matcher m1= r1.matcher(onlineBillsay);
		if (m.find()) {
			String token_num= m.group(1);
			System.out.println("Token Number: "+token_num);
			System.out.println("Found value: " + m.group(1));	
		} else {
			System.out.println("NO MATCH");
		}
		
		if (m1.find()) {
			String token_num= m1.group(1);
			System.out.println("Token Number: "+token_num);
			System.out.println("Found value: " + m1.group(1));	
		} else {
			System.out.println("NO MATCH");
		}
		
	
		
		
		
	}
}