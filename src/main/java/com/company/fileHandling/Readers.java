package com.company.fileHandling;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Readers {

    @Test
    public void withoutJava8() {
        System.out.println("Old way of reading file line by line in Java : ");
        int count = 1;
        try (FileReader fileReader = new FileReader("src/main/java/com/company/fileHandling/file1.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(count + " : " + line);
                line = bufferedReader.readLine();
                count++;
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @Test
    public void withJava8() {
        String path = "src/main/java/com/company/fileHandling/file1.csv";
        System.out.println("Reading file line by line using Files.lines() in Java 8");
        try(Stream<String> lines = Files.lines(Paths.get(path))){
            lines.forEach(System.out::println);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
        // You can do even better, you can read all lines trim them and filter out all empty lines
        /*System.out.println("Doing more things than just reading file using Java 8 Streams");
        Files.lines(new File("src/main/java/com/company/fileHandling/file1.csv").toPath())
                .map(s -> s.trim())
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);*/

        // You can also filter line using String methods e.g. print only lines which starts with "
        /*System.out.println("Printing lines which startswith \"");
        Files.lines(Paths.get("src/main/java/com/company/fileHandling/file1.csv"))
                .map(s -> s.trim())
                .filter(s -> s.startsWith("\""))
                .forEach(System.out::println);*/


    @Test
    public void readFileBufferedReader() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\OfficeNotes.txt");
        BufferedReader br = new BufferedReader(fr);
        StringBuffer str = new StringBuffer();
        try {
            while (br.readLine() != null) {
                str.append(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
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
