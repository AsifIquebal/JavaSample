package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class InterviewSet8_File {
    @Test
    public void removeDuplicateLines() throws IOException {
        PrintWriter printWriter = new PrintWriter("./src/main/java/com/company/fileHandling/output.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/main/java/com/company/fileHandling/test.txt"));
        String line = bufferedReader.readLine();
        HashSet<String> stringHashSet = new HashSet<>();
        while (line != null) {
            // write only if not present in hashset
            if (stringHashSet.add(line)) {
                printWriter.println(line);
            }
            line = bufferedReader.readLine();
        }
        printWriter.flush();
        bufferedReader.close();
        printWriter.close();
        System.out.println("File operation performed successfully");
    }

    @Test
    public void readAllFiles() throws FileNotFoundException {
        File directoryPath = new File("src/main/java/com/company/fileHandling/");
        File[] filesList = directoryPath.listFiles();
        System.out.println("List of files and directories in the specified directory:");
        Scanner scanner = null;
        assert filesList != null;
        for (File file : filesList) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Size :" + file.getTotalSpace());
            //Instantiating the Scanner class
            scanner = new Scanner(file);
            String input;
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                stringBuilder.append(input).append(" ");
            }
            System.out.println("Contents of the file: " + stringBuilder);
            System.out.println(" ");
        }
    }

    @Test
    public void fileListWithFilterListAllTextFiles() throws IOException {
        File directoryPath = new File("src/main/java/com/company/fileHandling/");
        FilenameFilter textFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        File[] files = directoryPath.listFiles(textFilter);
        assert files != null;
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.print("directory:");
            } else {
                System.out.print("file:");
            }
            System.out.println(file.getCanonicalPath());
        }
        //File[] filesList = directoryPath.listFiles(textFilter);
    }

    @Test
    public void extractDigitsFromAllFiles() throws IOException {
        File directoryPath = new File("src/main/java/com/company/fileHandling/");
        FilenameFilter filenameFilter = (dir, name) -> name.toLowerCase().endsWith(".txt");
        File[] files = directoryPath.listFiles(filenameFilter);
        assert files != null;
        for (File file : files) {
            System.out.println(file.getCanonicalPath());
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String content = scanner.nextLine();
                if (content.matches(".*\\d+.*")) {
                    System.out.println(content);
                    String number = content.replaceAll("[^0-9]", "");
                    System.out.println(number);
                }
            }
        }
    }
}
