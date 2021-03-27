package com.company.ds.linkedlist;

public class MyNode {
    public int data;
    public MyNode next;

    public MyNode(int data) {
        this.data = data;
        // below is not needed as next is by default null
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }


    /*@Override
    public String toString() {
        return "Node{" + "data=" + data ;//+ ", next=" + next + '}';
    }*/

}
