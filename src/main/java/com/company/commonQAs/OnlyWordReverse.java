package com.company.commonQAs;

import org.testng.annotations.Test;

/**
 * Created by user on 13-Jun-17.
 */
public class OnlyWordReverse {
    @Test
    public void q(){
        String str = "Tagrem India";
        String a[] = str.split(" ");
        String x = "";
        for(int i=0; i <a.length; i++){
            String s = a[i];
            String rev= "";
            for(int j=s.length()-1; j>=0; j--){
                rev = rev + s.charAt(j);
            }
            x = x+" "+rev;
        }
        System.out.println("Original: " + str);
        System.out.println("Words reverse: " + x);
    }
}
