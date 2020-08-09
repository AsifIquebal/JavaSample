package com.company.variablesAndMethods;

public class BlankFinalVariables {
    // blank final variables can be initialized through inline declaration and initiation
    // through constructor
    // through instance initialization block
    final int a;

    /*public BlankFinalVariables(){
        a = 10;
    }*/
    {
        a = 10;
    }

    public static void main(String[] args) {
        BlankFinalVariables fv = new BlankFinalVariables();
        System.out.printf("a: " + fv.a);
    }
}
