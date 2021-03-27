package com.company.ds.linkedlist;

import org.testng.annotations.Test;

public class EmployeeLinkedList {

    private EmployeeNode head;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }

    private void printList(){
        EmployeeNode currentNode = head;
        System.out.println("HEAD ->");
        //System.out.println("Is current Null: " + currentNode==null);
        //System.out.println(head.getEmployee().name);
        while (currentNode != null){
            System.out.print(currentNode + "->");
            currentNode = currentNode.getNext();
        }
    }
    /*public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }*/
    @Test
    public void test01(){
        Employee employee1 = new Employee("Jane",786);
        Employee employee2 = new Employee("John",123);
        Employee employee3 = new Employee("Mary",567);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);

        list.printList();


    }



}
