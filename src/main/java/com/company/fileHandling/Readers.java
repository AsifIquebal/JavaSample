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

    public static void scannerDemo() {
        Scanner sc = new Scanner(System.in);
        // String input
        String name = sc.nextLine();
        // Character input
        char gender = sc.next().charAt(0);
        // Numerical data input byte, short and float can be read using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        scannerDemo();
    }
}
