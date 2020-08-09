package com.company.inheritance;

class Outter {
    private static int var1 = 12;
    private void hello(){
        System.out.println("Private member of outter class");
    }

    static class Inner{

        private void hello(){
            System.out.println("Private method in Inner class");
            System.out.println(var1);
        }
    }
}

class Another extends Outter.Inner {

    public void test1(){

    }

}

public class Main {

}
