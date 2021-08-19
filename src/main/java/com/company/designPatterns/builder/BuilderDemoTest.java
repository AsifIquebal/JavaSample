package com.company.designPatterns.builder;

import org.testng.annotations.Test;

public class BuilderDemoTest {

    @Test
    public void test1(){
        BuilderDemo demo = new BuilderDemo.Builder().setFname("A").build();
        System.out.println(demo);

        BuilderDemo demo1 = new BuilderDemo.Builder().setFname("Asif").setLname("Sarkar").build();
        System.out.println(demo1);
    }


}
