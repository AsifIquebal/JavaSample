package com.company.generics;

public class GenericClass {

    public static void main(String[] args) {
        MyGenericClass<String, Integer> myGenericClass = new MyGenericClass<>("Test1",1);
        String a = myGenericClass.getItem1();
        int b = myGenericClass.getItem2();
        System.out.println(a + " : " + b);
        // the following is not allowed;
        //MyGenericClass<Integer, Integer> myGenericClass1 = new MyGenericClass<Integer, Integer>("Test1",1);

        /*int a1 = myGenericClass1.getItem1();
        int b1 = myGenericClass1.getItem2();
        System.out.println(a1 + " : " + b1);*/

    }

}


class MyGenericClass<I1,I2>{
    I1 item1;
    I2 item2;

    public MyGenericClass(I1 item1, I2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public I1 getItem1() {
        return item1;
    }

    public MyGenericClass<I1, I2> setItem1(I1 item1) {
        this.item1 = item1;
        return this;
    }

    public I2 getItem2() {
        return item2;
    }

    public MyGenericClass<I1, I2> setItem2(I2 item2) {
        this.item2 = item2;
        return this;
    }
}