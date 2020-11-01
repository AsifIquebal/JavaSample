package com.company.interfaces;

import org.testng.annotations.Test;

interface Drawable{
    void draw();
    default void msg(){System.out.println("default method");}
}

class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}

/*public class DefaultDemo{
    public static void main(String args[]){
        Drawable d = new Rectangle();
        d.draw(); //drawing rectangle
        d.msg(); //default method

        DefaultDemo defaultDemo = new DefaultDemo();
        //defaultDemo.msg();
    }
}*/

public class DefaultDemo implements Drawable{

    @Test
    public void t1(){
        Drawable d = new Rectangle();
        d.draw(); //drawing rectangle
        d.msg(); //default method
    }

    @Test
    public void t2(){
        DefaultDemo defaultDemo = new DefaultDemo();
        defaultDemo.msg();
    }

    @Override
    public void draw() {

    }
}
