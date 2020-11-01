package com.company.initializationBlocks;

public class StaticBlock {
    static int i;
    int j;
    // start of static block
    static {
        i = 10;
        System.out.println("Inside Static Block...");
    }

    StaticBlock(){
        System.out.println("Inside constructor...");
    }

    public static void main (String... asd){
        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.
        System.out.println(StaticBlock.i);
        // Now create an object
        // static blocks are executed before constructors
        StaticBlock obj1 = new StaticBlock();
        StaticBlock obj2 = new StaticBlock();
    }
}
// Java supports a special block, called static block (also called static clause) which can be used
// for static initializations
// of a class. The code inside static block is executed only once: the first time you make an object
// of that class or the first
// time you access a static member of that class (even if you never make an object of that class)

