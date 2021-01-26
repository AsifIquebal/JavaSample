package com.company.inheritance;

public class MainAsFinal {
    final public static void main(String[] args) {
        System.out.println("I am Final Main Method");
    }


}

// below will not be possible as parent has final main method
class WillInherit extends MainAsFinal{
    public static void main(String[] args) {

    }
}


