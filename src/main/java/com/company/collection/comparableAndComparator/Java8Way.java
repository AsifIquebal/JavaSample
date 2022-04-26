package com.company.collection.comparableAndComparator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class Java8Way {

    @Test
    public void test01() {
        Employee employee1 = new Employee(1, "Jack", "Wills");
        Employee employee2 = new Employee(2, "Jack", "Anderson");
        Employee employee3 = new Employee(3, "Jackson", "William");
        Employee employee4 = new Employee(5, "Wilson", "Hegs");
        Employee employee5 = new Employee(6, "Asif", "Sarkar");
        Employee employee6 = new Employee(7,null, "NULL Last Name");
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        Comparator<Employee> sortByNaturalOrder = comparing(Employee::getFirstName, naturalOrder());
        sortListAndPrint(list, sortByNaturalOrder);
        Comparator<Employee> sortByDescendingOrder = comparing(Employee::getFirstName, reverseOrder());
        sortListAndPrint(list, sortByDescendingOrder);
        Comparator<Employee> sortByDescendingOrder_NoCase = comparing(Employee::getFirstName,
                String.CASE_INSENSITIVE_ORDER.reversed());
        sortListAndPrint(list, sortByDescendingOrder_NoCase);
        Comparator<Employee> keepNullAtLast = comparing(Employee::getFirstName, nullsLast(naturalOrder()));
        sortListAndPrint(list, keepNullAtLast);
    }

    private void sortListAndPrint(List<Employee> list, Comparator<Employee> sortByNaturalOrder) {
        System.out.println("--------------------------------------------");
        list.sort(sortByNaturalOrder);
        System.out.println(list);
    }

}
