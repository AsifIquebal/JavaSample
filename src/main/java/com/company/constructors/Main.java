package com.company.constructors;

class consBase{
    String str;
    consBase(String str){
        this.str = str;
    }

    consBase(){
        // this is very much needed; otherwise compile time error occurs
    }
}

class consDrrived extends consBase{

}



public class Main {
}
