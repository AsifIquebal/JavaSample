package com.company.commonQAs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 20-May-17.
 */
public class FileReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\OfficeNotes.txt");
        BufferedReader br = new BufferedReader(fr);
        StringBuffer str = new StringBuffer();
        try {
            while (br.readLine()!= null){
                str.append(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }

}
