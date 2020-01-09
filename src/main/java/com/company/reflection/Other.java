package com.company.reflection;

public class Other {
    // creating a private field
    private String s;
    // creating a public constructor
    public Other()  {  s = "GeeksforGeeks"; }
    // Creating a public method with no arguments
    public void m_pub1()  {
        System.out.println("The string is " + s);
    }
    // Creating a public method with int as argument
    public void m_pub2(int n)  {
        System.out.println("The number is " + n);
    }
    // an static method
    public static void staticMethod(){
        System.out.println("this is an static method...");
    }
    // creating a private method
    private void m_pri1() {
        System.out.println("Private method invoked");
    }


}




