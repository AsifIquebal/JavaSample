package com.company.ds.linkedlist;

public class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return " Employee{ name='" + name + ", id=" + id + "} ";
    }



}