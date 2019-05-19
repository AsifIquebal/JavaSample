package com.company.classes;

class Outter{
    int a;
    void show(){
        System.out.println("Ouuter class method");
    }

    class Inner{
        void display(){
            System.out.println("Inner class method");
        }
    }


}

public class InnerDemo {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.show();

        Outter.Inner inner = outter.new Inner();
        inner.display();

    }
}
