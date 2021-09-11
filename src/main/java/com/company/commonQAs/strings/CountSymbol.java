package com.company.commonQAs.strings;


import org.testng.annotations.Test;

public class CountSymbol {

    @Test
    public void countSymbol_usingSplitMethod(){
        String str = "hello,123,tom";
        String[] strArray = str.split(",");
        System.out.println(strArray.length-1);
    }

    @Test
    public void looping() {
        String str = "32073,32726,32220,32042,34232,32715";
        System.out.println("Total Commas: " + (str.split(",").length-1));

        
    }
}

// Iterating over collection 'c' using terator
