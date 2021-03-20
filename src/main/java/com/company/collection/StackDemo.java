package com.company.collection;

import org.testng.annotations.Test;

import java.util.Stack;

public class StackDemo {
    @Test
    public void test1() {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty stack : " + stack);
        System.out.println("Empty stack : " + stack.isEmpty()); //true
        // Exception in thread "main" java.util.EmptyStackException
        // System.out.println("Empty stack : Pop Operation : "  + stack.pop());
        stack.push(1001);stack.push(1002);stack.push(1003);
        System.out.println(stack.push(1004));//1004
        System.out.println("Non-Empty stack : " + stack);//Non-Empty stack : [1001, 1002, 1003, 1004]
        System.out.println("Non-Empty stack: Pop Operation : " + stack.pop());//Non-Empty stack: Pop Operation : 1004
        System.out.println("After Pop Operation : " + stack);//After Pop Operation : [1001, 1002, 1003]
        System.out.println("search() Operation : " + stack.search(1002));//search() Operation : 2
        System.out.println("Non-Empty stack : " + stack.isEmpty());

    }
}