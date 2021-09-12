package com.company.commonlyasked;

import java.util.Scanner;

public class ExtractNumberFromStringAndAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the alphanumeric string:");
        String inputByUser = sc.nextLine();
        System.out.println("String entered by user: " + inputByUser);
        int sum = 0;
        boolean flagRegex = inputByUser.matches(".*\\d+.*");
        // if string is alphanumeric, extract char and check if it is digit
        if (flagRegex) {
            for (int i = 0; i < inputByUser.length(); i++) {
                char c = inputByUser.charAt(i);
                if (Character.isDigit(c)) {
                    sum = sum + Character.getNumericValue(c);
                }
            }
            System.out.println("Sum of numbers found in " + inputByUser + " : " + sum);
        } else {
            System.out.println(inputByUser + " is not an alphanumeric.");
        }
    }

}
