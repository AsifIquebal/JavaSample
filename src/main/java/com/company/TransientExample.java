package com.company;

import java.io.*;

public class TransientExample {
    public static void main(String args[]) throws Exception {
        Name outputName = new Name("Steve", "Middle","Jobs");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/main/java/com/company/name.txt"));
        // writing to object
        o.writeObject(outputName);
        o.close();
        // reading from object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/com/company/name.txt"));
        Name inputName = (Name)in.readObject();
        System.out.println(inputName);
    }
}

class Name implements Serializable {
    private String firstName;
    private transient String middleName; // transient variable
    private String lastName;
    public Name(String fName, String mName, String lName){
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
    }
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(40);
        sb.append("First Name : ");
        sb.append(this.firstName);
        sb.append("\nMiddle Name : ");
        sb.append(this.middleName);
        sb.append("\nLast Name : ");
        sb.append(this.lastName);
        return sb.toString();
    }
}
