package com.company.lambda;

public class Persons {
    private String fname;
    private String lname;
    private int age;

    public Persons(String fname, String lname, int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public String getName() {
        return fname;
    }

    public Persons setName(String fname) {
        this.fname = fname;
        return this;
    }

    public String getLname() {
        return lname;
    }

    public Persons setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Persons setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
