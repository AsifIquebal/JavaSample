package com.company.commonQAs;

/**
 * Created by user on 12-May-17.
 */
public class bou {
    public static void main(String[] args) {

        System.out.println("my name is Asif: ");

        String a = "Asif           is a    bhitu boy  ";
        System.out.println(a.replaceAll("\\s",""));

        String s1 = new String("abodeqa");
        String s2 = new String("abodeqa");
        String s3 = "abodeqa";
        System.out.println( s1==s2 ); // return false because both the object are referring to different memory locations
        System.out.println( s1==s3 ); // return false because s1 is in heap and s3 is in string pool
        System.out.println( "s1.equals(s2): " + s1.equals(s2) );
        System.out.println( "s1.equals(s3): " + s1.equals(s3) );

        System.out.println("replace: " + "abacada".replace("a",""));
    }
}
