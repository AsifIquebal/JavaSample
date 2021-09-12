package com.company.commonlyasked;

/**
 * Created by user on 20-Dec-16.
 */
public class FindLengthCharAt {

    public static void main(String args[]) {
        String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLengthOfString(helloWorld));
    }

    public static int getLengthOfString(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }
        } catch (Exception e) {
        }
        return i;
    }
}
