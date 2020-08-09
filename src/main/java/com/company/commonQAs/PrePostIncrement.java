package com.company.commonQAs;

public class PrePostIncrement {

    public static void main(String[] args) {

        int i = 1111;
        i = i++;
        System.out.println(i);
        /*int j = i;
        System.out.println(j);*/
        int k = i-- + --i;
        System.out.println(k);

        Y y = new Y();
    }
}

class X {
    int m = 1111;
    {
        m = m++;
        System.out.println(m);
    }
}

class Y extends X {
    {
        System.out.println(methodOfY());
    }
    int methodOfY() {

        return m-- + --m;
    }
}

/*
*
++a
a = a + 1;
return a;
/////////////////////
a++
temp = a;
a = a + 1;
return temp;
*
* */
