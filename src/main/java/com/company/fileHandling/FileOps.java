package com.company.fileHandling;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FileOps {

    @Test
    public void test01() {
        File file = new File("src/main/java/com/company/fileHandling/test.txt");

        if (file.exists()) {
            getFileAttributes(file);
            System.out.println(readFile(file));
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File Created: " + file.getName());
                    writeInFile(file);
                    getFileAttributes(file);
                    System.out.println(readFile(file));
                } else {
                    System.out.println("File Operation completed. Please check.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test02() {
        File file = new File("src/main/java/com/company/fileHandling/test.txt");
        posixFilePermission(file);
    }

    @Test
    public void test03() {
        File file = new File("src/main/java/com/company/fileHandling/test.txt");
        boolean delete = file.delete();
        System.out.println("File deleted = " + delete);
    }

    public void getFileAttributes(File file) {
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Writeable: " + file.canWrite());
        System.out.println("Readable: " + file.canRead());
        System.out.println("File size in bytes: " + file.length());
        System.out.println("File is executable? " + file.canExecute());
        //check file permissions for application user
    }

    public String readFile(File file) {
        String str = null;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return str;
    }

    public void writeInFile(File file) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Java is the prominent programming language of the millenium!");
        } catch (IOException e) {

        } finally {
            assert fileWriter != null;
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void filePermission(File file) {
        //change file permissions for application user only
        file.setReadable(false);
        file.setWritable(false);
        file.setExecutable(false);
        //change file permissions for other users also
        file.setReadable(true, false);
        file.setWritable(true, false);
        file.setExecutable(true, true);
    }

    public void posixFilePermission(File file) {
        //using PosixFilePermission to set file permissions 777
        Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
        //add owners permission
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        //add group permissions
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        //add others permissions
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);
        try {
            Files.setPosixFilePermissions(Paths.get(String.valueOf(file)), perms);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}