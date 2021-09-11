package com.company.fileHandling;

import org.testng.annotations.Test;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedReaderExample {

    @Test
    public void test01() {
        FileInputStream fis = null;
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fis = new FileInputStream("src/main/java/com/company/fileHandling/test.txt");
            bufferedReader = new BufferedReader(new InputStreamReader(fis));
            System.out.println("File content below:");
            String line = bufferedReader.readLine();
            while (line != null) {
                // append is an overloaded method for string, char, chars etc.
                // below will append lines all together, so we will miss out the new line chars
                stringBuilder.append(line);
                //System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(stringBuilder);
    }

}
