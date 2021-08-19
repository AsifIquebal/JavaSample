package com.company.designPatterns.builder;

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

    private BuilderDemo(Builder builder) {
        this.fname = builder.fname;
        this.lname = builder.lname;
        this.state = builder.state;
        this.country = builder.country;
        this.age = builder.age;
        this.salary = builder.salary;
        this.hasVisa = builder.hasVisa;
    }

    public static class Builder {
        private String fname;
        private String lname;
        private String state;
        private String country;
        private int age;
        private double salary;
        private boolean hasVisa;

        public Builder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        public Builder setLname(String lname) {
            this.lname = lname;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setHasVisa(boolean hasVisa) {
            this.hasVisa = hasVisa;
            return this;
        }

        public BuilderDemo build() {
            return new BuilderDemo(this);
        }

    }


}
