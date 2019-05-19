package com.company.variablesAndMethods;

/**
 * Created by user on 30-Nov-16.
 */
public class Variables {
    // this instance variable is visible for any child class.
    public String name;
    // salary  variable is visible in Variables class only.
    private double salary;
    // The name variable is assigned in the constructor.
    public Variables (String empName) {name = empName;}
    // The salary variable is assigned a value.
    public void setSalary(double empSal) {salary = empSal;}
    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }
    public static void main(String[] args) {
        Variables variables = new Variables("Asif");
        variables.setSalary(12450);
        variables.printEmp();
    }
}
