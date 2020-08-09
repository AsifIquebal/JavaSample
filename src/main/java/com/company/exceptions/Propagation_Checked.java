package com.company.exceptions;

import java.io.IOException;

public class Propagation_Checked {
    void m() throws IOException {
        throw new java.io.IOException("device error"); //checked exception
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handeled");
        }
    }
    public static void main(String args[]){
        Propagation_Checked obj = new Propagation_Checked();
        obj.p();
        System.out.println("normal flow");
    }
}
