package com.company.interfaces;

public class MarkerDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(786, "Asif");
        // cloning 'a' and holding new cloned object reference in b
        // down-casting as clone() return type is Object
        A b = (A)a.clone();
        System.out.println(b.i);
        System.out.println(b.s);
    }
}

class A implements Cloneable{
    int i;
    String s;
    public A(int i, String s){
        this.i = i;
        this.s = s;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}


