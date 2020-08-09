package com.company.classes;

class Outter{
    int a;
    void show(){
        System.out.println("Outter class method");
    }

    class Inner{
        void display(){
            //a = 10;
            System.out.println("Enclosing class member a: " + a);
            System.out.println("Inner class method");
        }
    }

    private class Inner2{
        void display(){
            System.out.println("Enclosing class member a: " + a);
            System.out.println("private inner class");
        }
    }

}

public class InnerDemo {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.show();
        outter.a = 10;

        Outter.Inner inner = outter.new Inner();
        inner.display();


    }
}



