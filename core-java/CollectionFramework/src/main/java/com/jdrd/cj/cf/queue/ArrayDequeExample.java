package com.jdrd.cj.cf.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        System.out.println("Pushing 1 and 2");
        arrayDeque.push(1);
        arrayDeque.push(2);


        System.out.println(arrayDeque);

        System.out.println("offering 3 and 4");
        arrayDeque.offer(3);
        arrayDeque.offer(4);
        System.out.println(arrayDeque);

        System.out.println("Poll: "+ arrayDeque.poll());
        System.out.println("Pop: " + arrayDeque.pop());

        System.out.println(arrayDeque);

        System.out.println("pollLast: " + arrayDeque.pollLast());

    }
}
