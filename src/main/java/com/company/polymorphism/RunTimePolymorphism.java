package com.company.polymorphism;

/**
 * Created by user on 05-Dec-16.
 */


class Figure{
    double dim1, dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    double area() {
        System.out.println("Area of Figure is undefined:");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    double area() {
        System.out.println("Area of Rectangle:");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    double area() {
        System.out.println("Area of Right Triangle:");
        return dim1*dim2/2;
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Super Class Reference Variable can refer to Sub Class Object");
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figure;
        figure = f;
        System.out.println("Area ["+figure.dim1+", " +figure.dim2+"] is: " + figure.area());

        /*Figure figure = new Rectangle(9, 5);*/
        figure = r;
        System.out.println("Area ["+figure.dim1+", " +figure.dim2+"] is: " + figure.area());

        figure = t;
        System.out.println("Area ["+figure.dim1+", " +figure.dim2+"] is: " + figure.area());
    }

}

