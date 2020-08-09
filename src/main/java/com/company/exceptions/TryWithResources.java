package com.company.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        int n;
        //String n;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            n = bufferedReader.read();
        }
        System.out.println(n);
    }
}
