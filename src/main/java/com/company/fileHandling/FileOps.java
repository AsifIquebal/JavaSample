package com.company.fileHandling;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FileOps {

    @Test
    public void removeDuplicateLines() throws IOException {
        PrintWriter pw = new PrintWriter("./src/main/java/com/company/fileHandling/output.txt");
        BufferedReader br = new BufferedReader(new FileReader("./src/main/java/com/company/fileHandling/test.txt"));
        String line = br.readLine();
        HashSet<String> hs = new HashSet<>();
        while (line != null) {
            // write only if not present in hashset
            if (hs.add(line)) {
                pw.println(line);
            }
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        System.out.println("File operation performed successfully");
        
    }

    @Test
    public void test_BufferedReaderExample() {
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
            Logger.getLogger(FileOps.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(FileOps.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(stringBuilder);
    }

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
    public void findDuplicateWordInFile() {
        File file = new File("src/main/java/com/company/fileHandling/test.txt");
        String totalContent = readFile(file);
        //System.out.println(totalContent);
        String[] words = totalContent.split("\\s+");
        //System.out.println(Arrays.toString(words));
        Set<String> stringSet = new HashSet<>();
        for (String str : words) {
            if (!stringSet.add(str)) {
                System.out.println("Found Duplicate: " + str);
            }
        }
    }

    public String readFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    @Test
    public void findDuplicateWordInFileAndCountIt() {
        File file = new File("src/main/java/com/company/fileHandling/test.txt");
        String totalContent = readFile(file);
        //System.out.println(totalContent);
        //String[] words = totalContent.split("\\s+");
        //System.out.println(Arrays.toString(words));
        Map<String, Long> map = Arrays
                .stream(totalContent.split("\\s+"))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " " + v);
            }
        });
    }

    @Test
    public void test02() throws IOException {
        String s = "src/main/java/com/company/fileHandling/test.txt";
        List<String> lines = Files.readAllLines(Paths.get(s));
        System.out.println(lines.size());
        System.out.println(lines);
    }

    @Test
    public void test03() {
        File file = new File("src/main/java/com/company/fileHandling/test.txt");
        posixFilePermission(file);
    }

    @Test
    public void test04() {
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


    public void writeInFile(File file) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Java is the prominent programming language of the millennium!");
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
