package com.company.collection;

import com.company.lambda.Employee;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    @Test
    public void demo1() {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> my_set = new HashSet<>();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(my_set.add(count[i]));
            }
            System.out.println(my_set);

            TreeSet<Integer> sortedSet = new TreeSet<>(my_set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("The First element of the set is: " + sortedSet.first());
            System.out.println("The last element of the set is: " + sortedSet.last());
        } catch (Exception e) {
        }
    }

    @Test
    public void demo2() {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            set.add(i);
        }
        for (int j = 3; j <= 7; j++) {
            System.out.println("inserting " + j + ", result: " + set.add(j));
        }
        System.out.println(set);
    }

    @Test
    public void test() {
        Set<Integer> set = new HashSet<>();
        int a = 10;
        int b = 20;
        set.add(a);
        set.add(b);
        b = 10;
        System.out.println(set);

        b = 10;
        set.add(b);
        System.out.println(set);

    }

    @Test
    public void nullInHashSet() {
        Set<Integer> set = new HashSet<>();
        int a = 10;
        set.add(a);
        set.add(null);
        set.add(null);
        for (Integer s : set) {
            System.out.println(s);
        }
    }


    // TreeSet doesn't allow even a single null element. On doing so Null Pointer Exception on run time will be thrown
    @Test
    public void nullInTreeSet() {
        Set<Integer> set = new TreeSet<>();
        int a = 10;
        set.add(a);
        set.add(null);
        set.add(null);
        for (Integer s : set) {
            System.out.println(s);
        }
    }

    @Test
    public void treeSetUsingComparator() {
        Employee employee1 = new Employee("Emp1", 1200);
        Employee employee2 = new Employee("Emp2", 1000);
        Employee employee3 = new Employee("Emp3", 2000);
        Set<Employee> setEmployees = new TreeSet<>(new SalaryComparator());
        setEmployees.add(employee1);
        setEmployees.add(employee2);
        setEmployees.add(employee3);
        setEmployees.forEach(System.out::println);
    }


}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}
