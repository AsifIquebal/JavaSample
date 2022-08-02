package com.company.fileHandling;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

}
