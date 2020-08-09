package com.company.regex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    public static void main(String[] args) throws IOException {
        String oldFileName = "C:/Users/user/Desktop/a.txt";
        String tmpFileName = "C:/Users/user/Desktop/tmp_a.txt";
        String contents = new String(Files.readAllBytes(Paths.get(oldFileName)));
        System.out.println(contents);
        Pattern p1 = Pattern.compile("((arrFunc)(.|\\s\\S)*(\\);))", Pattern.DOTALL);
        Matcher m1 = p1.matcher(contents);
        while (m1.find()) {
            System.out.println("Match: " + m1.group());
            contents = contents.replace(m1.group(),"arrFunc.push(function(){\n\t\tAdded Replacement\n\t});");
        }
        System.out.println(contents);

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(tmpFileName));
            bw.write(contents);
        } catch (Exception e) {
            return;
        } finally {

            try {
                if(bw != null)
                    bw.close();
            } catch (IOException e) {
            }
        }
        File oldFile = new File(oldFileName);
        oldFile.delete();
        File newFile = new File(tmpFileName);
        newFile.renameTo(oldFile);
    }

}

