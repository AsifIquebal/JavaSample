package com.company.fileHandling;

import com.opencsv.CSVWriter;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CSVDemo {

    @Test
    public void test01() throws IOException {
        File directoryPath = new File("src/main/java/com/company/fileHandling/");
        FilenameFilter filenameFilter = (dir, name) -> name.toLowerCase().endsWith(".csv");
        File[] files = directoryPath.listFiles(filenameFilter);
        assert files != null;
        for (File file : files) {
            System.out.println("processing " + file.getName());
            List<String[]> collect =
                    Files.lines(file.toPath())
                            .map(line -> line.split(","))
                            .collect(Collectors.toList());
            Map<String, String> map = new LinkedHashMap<>();
            int i = 0;
            for (String s : collect.get(0)) {
                map.put(s, collect.get(1)[i++]);
            }
            map.put("firstname", "prafull");
            map.put("lastname", "zade");
            write(map, file);
        }
    }

    public void write(Map<String, String> map, File file) throws IOException {
        FileWriter outputfile = new FileWriter(file);
        String[] header = map.keySet().toArray(new String[0]);
        String[] dataSet = map.values().toArray(new String[0]);
        CSVWriter writer = new CSVWriter(outputfile, ',', CSVWriter.NO_QUOTE_CHARACTER, '/', "\n");
        writer.writeNext(header);
        writer.writeNext(dataSet);
        writer.close();
    }

}
