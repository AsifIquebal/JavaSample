package com.company.constructors;

import org.testng.annotations.Test;

public class BuilderDemoTest {

    @Test
    public void test1(){
        BuilderDemo demo = new BuilderDemo.BuilderDemoBuilder().setFname("A").build();
        System.out.println(demo);

        BuilderDemo demo1 = new BuilderDemo.BuilderDemoBuilder().setFname("Asif").setLname("Sarkar").build();
        System.out.println(demo1);
    }


}
