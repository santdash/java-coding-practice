package com.jdrd.cj.cf.list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Collection and list method usages are not mentioned here. Refer ArrayListExample for the same.
        // Since Stack is also a list all list methods are applicable for stack as-well.
        // Only Stack specific usages are described here.

        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Push 10, 20, 30, 40, 50 to Stack");
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);
        integerStack.push(50);

        System.out.println("After push: " + integerStack);
        System.out.println("Peeking to the stack:" + integerStack.peek());
        System.out.println("Popping from stack, popped element: " + integerStack.pop());

        System.out.println("Final Stack: " + integerStack);

    }
}
