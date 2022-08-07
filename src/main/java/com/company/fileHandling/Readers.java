package com.company.fileHandling;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Scanner;

public class Readers {
    @Test
    public void readFileBufferedReader() throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\OfficeNotes.txt");
        BufferedReader br = new BufferedReader(fr);
        StringBuffer str = new StringBuffer();
        try {
            while (br.readLine() != null) {
                str.append(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }

    @Test
    public void test01() throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an number:");
        int a = Integer.parseInt(bufferReader.readLine());
        System.out.printf("You entered: " + a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter an number:");
        a = scanner.nextInt();
        System.out.printf("You entered: " + a);
    }

}
