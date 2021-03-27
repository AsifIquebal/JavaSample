package com.company.ds.linkedlist;

import org.testng.annotations.Test;

public class MyLinkedList {

    public MyNode head = null;
    public MyNode tail = null;
    /*public MyLinkedList() {

    }
    MyLinkedList myLinkedList = new MyLinkedList();*/

    public void insert(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode and then tail will be the NewNode
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void printLinkedList(MyLinkedList list) {
        MyNode currentNode = list.head;
        // below we are only checking currentNode for Null
        // not currentNode.next
        // as the last currentNode.next will be Null
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void getSize(){

    }

    @Test
    public void test01() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.insert(12);
        linkedList.insert(14);
        linkedList.insert(16);
        System.out.println(linkedList.isEmpty());
        printLinkedList(linkedList);
        //linkedList.getSize();
    }

    /*@Override
    public String toString() {
        return "LinkedList: {" + "head=" + head + '}';
    }*/
}
