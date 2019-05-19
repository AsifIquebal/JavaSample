package com.company.triangle;

public class W {
    static int c = 0;

    public static void main(String[] args) {
        W w1 = c(); //1
        W w2 = c(w1);//2
        W w3 = c(w2);//null
        W w4 = c(w3);//null
    }

    private W() {
        System.out.println("c = " + c);
    }

    static W c() {
        return c++ <= 0 ? new W() : null;
    }

    static W c(W w) {
        return w.c++ == 1 ? new W() : null;
    }
}

//null
//2
//null
