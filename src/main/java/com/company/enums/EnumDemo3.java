package com.company.enums;

/**
 * Created by user on 19-Nov-16.
 */
enum myApple{
    Jonathan(10),GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    myApple(int p){
        price = p;
    }

    int getPrice() {
        return price;
    }

}

public class EnumDemo3 {
    public static void main(String args[]) {

        myApple ap;

        System.out.println("Winesap cost: " + myApple.Winesap.getPrice());

        System.out.println("All Apple prices: ");
        for (myApple a: myApple.values()) {
            System.out.println(a + " costs " + a.getPrice());
        }
    }
}
