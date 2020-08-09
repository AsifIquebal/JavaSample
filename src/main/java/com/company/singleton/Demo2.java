package com.company.singleton;

import org.testng.annotations.Test;

public class Demo2 {
    @Test
    public void test1(){
        SClass1 obj1 = SClass1.getInstance();
        SClass1 obj2 = SClass1.getInstance();
        System.out.println(obj1.str);

        System.out.println(String.format("Object: %s, HashCode: %d", "obj1", obj1.hashCode()));
        System.out.println(String.format("Object: %s, HashCode: %d", "obj2", obj2.hashCode()));
    }

    @Test
    public void test2(){
        SClass1 obj1 = SClass1.getInstance();
        obj1.str = obj1.str.toUpperCase();
        System.out.println(obj1.str);

        SClass1 obj2 = SClass1.getInstance();
        System.out.println(obj2.str);
    }
}

class SClass1{

    public static SClass1 instance = null;

    public String str;

    private SClass1(){
        str = "Asif";
    }

    public static SClass1 getInstance(){
        if(instance==null){
            instance = new SClass1();
        }
        return instance;
    }

}
