package com.company;

public class StaticAndFinalVariable {
    public static void main(String[] args) {
        System.out.println(Hello.x);
        System.out.println(Hello.name);
    }
}
// even if static block executes at the time of class loading, its needs a trigger
// which in this case is when we are accessing the instance static variable
// the final varibale is in-line, so already available to compiler
class Hello {
    public final static int x = 10;
    public static String name = "Suja";
    static {
        System.out.println("Hello");
    }
}
