package com.company.lambda;

public class Employee {
    public String empName;
    public int salary;

    public Employee(String empName, int salary) {
        this.empName = empName;
        this.salary = salary;
    }


    public void salaryIncrement(int i) {
        salary = salary + i;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
