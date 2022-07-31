package com.company.collection.comparableAndComparator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class Java8Way {

    private Employee employee;
    List<Employee> list = new ArrayList<Employee>();

    @BeforeClass
    private void setUp() {
        Employee employee1 = new Employee(1, "Jack", "Wills");
        Employee employee2 = new Employee(2, "Jack", "Anderson");
        Employee employee3 = new Employee(3, "Jackson", "William");
        Employee employee4 = new Employee(5, "Wilson", "Hegs");
        Employee employee5 = new Employee(6, "Asif", "Sarkar");
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
    }

    @Test
    public void test01() {
        Comparator<Employee> sortByNaturalOrder = Comparator.comparing(Employee::getFirstName, naturalOrder());
        list.sort(sortByNaturalOrder);
        System.out.println(list);
        System.out.println("--------------------------------------------");
        Comparator<Employee> sortByDescendingOrder = comparing(Employee::getFirstName, reverseOrder());
        list.sort(sortByDescendingOrder);
        System.out.println(list);

        System.out.println("Comparator.reversed()=========================");
        list.sort(sortByNaturalOrder.reversed());
        list.sort(Comparator.comparing(Employee::getEmpId));
        System.out.println("Sort by id: \n" + list);
        list.sort(Comparator.comparing(Employee::getEmpId).reversed());
        System.out.println("Sort by id in reverse order: \n" + list);
        System.out.println("--------------------------------------------");
        Comparator<Employee> sortByDescendingOrder_NoCase = comparing(Employee::getFirstName,
                String.CASE_INSENSITIVE_ORDER.reversed());
        list.sort(sortByDescendingOrder_NoCase);
        System.out.println(list);
        System.out.println("--------------------------------------------");
    }

    // TODO: handle NPE
    /*@Test
    public void nullCase(){
        Employee employee6 = new Employee(7,null, "NULL Last Name");
        list.add(employee6);
        Comparator<Employee> keepNullAtLast = comparing(Employee::getFirstName, nullsLast(naturalOrder()));
        list.sort(keepNullAtLast);
    }*/

    @Test
    public void nullsFirst(){
        Employee employee6 = new Employee(7,null, "NULL Last Name");
        list.add(employee6);
        System.out.println(list);
        list.sort(Comparator.nullsFirst(Comparator.comparing(Employee::getFirstName)));
        System.out.println(list);


        // todo
        //comparing(Employee::getFirstName, nullsLast(naturalOrder()));
    }



    @Test
    public void nullsLast(){
        Employee employee6 = new Employee(7,null, "NULL Last Name");
        list.add(employee6);
        list.sort(Comparator.nullsLast(Comparator.comparing(Employee::getFirstName)));
        System.out.println(list);
    }

}
