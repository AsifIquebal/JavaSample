package com.company.fileHandling;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FileOps {

    @Test
    public void test01() {
        File file = new File("src/main/java/com/company/fileHandling/test.txt");

        if (file.exists()) {
            System.out.println("File exists: " + file.exists());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        }
        try {
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}