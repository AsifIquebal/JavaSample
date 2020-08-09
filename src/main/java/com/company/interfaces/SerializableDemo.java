package com.company.interfaces;

import java.io.*;

// By implementing Serializable interface we make sure that state of instances of class A can be saved in a file.
class AS implements Serializable {
    int i;
    String s;
    // A class constructor
    public AS(int i,String s){
        this.i = i;
        this.s = s;
    }
}

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AS a = new AS(20,"GeeksForGeeks");
        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("src/main/java/com/company/interfaces/xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("src/main/java/com/company/interfaces/xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        AS b = (AS)ois.readObject();//down-casting object
        System.out.println(b.i+" "+b.s);
        // closing streams
        oos.close();
        ois.close();
    }
}