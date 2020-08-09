package com.company.constructors;

public class BuilderDemo {

    @Override
    public String toString() {
        return "BuilderDemo{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hasVisa=" + hasVisa +
                '}';
    }

    private String fname;
    private String lname;
    private String state;
    private String country;
    private int age;
    private double salary;
    private boolean hasVisa;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isHasVisa() {
        return hasVisa;
    }

    public BuilderDemo(BuilderDemoBuilder builderDemoBuilder){
        this.fname = builderDemoBuilder.fname;
        this.lname = builderDemoBuilder.lname;
        this.state = builderDemoBuilder.state;
        this.country = builderDemoBuilder.country;
        this.age = builderDemoBuilder.age;
        this.salary = builderDemoBuilder.salary;
        this.hasVisa = builderDemoBuilder.hasVisa;
    }

    public static class BuilderDemoBuilder{
        private String fname;
        private String lname;
        private String state;
        private String country;
        private int age;
        private double salary;
        private boolean hasVisa;

        public BuilderDemoBuilder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        public BuilderDemoBuilder setLname(String lname) {
            this.lname = lname;
            return this;
        }

        public BuilderDemoBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public BuilderDemoBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public BuilderDemoBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderDemoBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public BuilderDemoBuilder setHasVisa(boolean hasVisa) {
            this.hasVisa = hasVisa;
            return this;
        }

        public BuilderDemo build(){
            return new BuilderDemo(this);
        }

    }



}
