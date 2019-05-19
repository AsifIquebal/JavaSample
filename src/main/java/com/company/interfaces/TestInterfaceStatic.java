package com.company.interfaces;

interface Drawable1{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle1 implements Drawable1{
    public void draw(){System.out.println("drawing rectangle");}
}

public class TestInterfaceStatic{
    public static void main(String args[]){
        Drawable1 d = new Rectangle1();
        d.draw(); //drawing rectangle
        System.out.println(Drawable1.cube(3)); //27
    }
}
