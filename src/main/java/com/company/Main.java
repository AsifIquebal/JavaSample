package com.company;
//Implement following Java class StringSplitter and enum Separator. See the class
// Main for an example how to use the classes to be implemented.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

enum Separator {
    // TODO: Code goes here
    //FORWARD_SLASH,BACK_SLASH,COMMA,SEMICOLON,COLON,PERIOD;
    FORWARD_SLASH{
        public String toString() {
            return "\\/";
        }
    },
    PERIOD{
        public String toString() {
            return "\\.";
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Simple splitter with one parameter
        // This should result in {“tmp”, “file.txt”)
        StringSplitter s1 = new StringSplitter(Separator.FORWARD_SLASH.toString());
        //List<String> split1 = s1.split("/tmp/file.txt");
        List<String> split1 = s1.split("/tmp/file.txt");
        System.out.println(split1.toString());

        // Complex splitter with two parameters
        // This should result in {“tmp”, “file”, “txt”)
        StringSplitter s2 = new StringSplitter(Separator.FORWARD_SLASH.toString(),
                Separator.PERIOD.toString());
        List<String> split2 = s2.split("/tmp/file.txt");
        System.out.println(split2.toString());
    }
}

/**
 * Class for splitting strings into lists of substrings. Constructor
 * can have one or more parameters specifying all separator characters
 * as an enum.
 */
class StringSplitter {

    // TODO: Constructor
    /*
    public StringSplitter(Separator forwardSlash) {
        separator = forwardSlash;
    }
    */
    List<String> splitter = new ArrayList<>();
    public StringSplitter(String splitter1){
        splitter.add(splitter1);
    }

    StringSplitter(String splitter1, String splitter2){
        splitter.add(splitter1);
        splitter.add(splitter2);
    }
    /**
     * Splits the given string based on the separator(s) given at * in the constructor.
     * @param //string String to be split
     * @return Resulting list of substrings.
     */
    public List<String> split(String string) {
        List<String> splittedList = null;
        String[] tempArr = null;
        StringTokenizer st = new StringTokenizer(string, splitter.toString());
        splittedList = new ArrayList<String>();
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            splittedList.add(s);
            //System.out.println(s);
        }

        /*if(null != splitter && !splitter.isEmpty()){
            splittedList = new ArrayList<String>();
            String arr = null;
            for(String split : splitter){
                if(null==arr){
                    arr = split;
                } else {
                    arr = arr + "|" + split;
                }
            }
            tempArr = string.split(arr);
            if(null!=tempArr && tempArr.length>0){
                splittedList = new ArrayList<String>(Arrays.asList(tempArr));
            }
            //tempArr = null;
        }*/
        if(null!=splittedList && !splittedList.isEmpty()){
            splittedList.removeAll(Arrays.asList(""));
        }
        return splittedList;
    }


}

















