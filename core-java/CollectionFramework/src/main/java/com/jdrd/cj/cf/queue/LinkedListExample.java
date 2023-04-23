package com.jdrd.cj.cf.queue;

import java.util.*;

/** Linked list implements both List and Deque.
 * So this can be used as Deque or List. This is helpful when both List and Queue operation is required.
 * Otherwise, ArrayList is better option as List.
 *  ArrayDeque is better option as Deque. (Synchronized version of this ArrayDeque cannot be created using Collections class)
 */
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        processAsDeque(data);
        processAsList(data);
    }

    private static void processAsDeque(Deque<Integer> deque){
        System.out.println("Running deque.push(1);\n" +
                "        deque.offer(2);\n" +
                "        deque.offerFirst(3);\n" +
                "        deque.offerLast(4);\n" +
                "        deque.addFirst(5);\n" +
                "        deque.addLast(6);");
        deque.push(1);
        deque.offer(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.addFirst(5);
        deque.addLast(6);
        System.out.println(deque);

        System.out.println("deque.pollFirst(): " +deque.pollFirst());
        System.out.println("deque.pollLast(): " +deque.pollLast());
        System.out.println("deque.poll(): " +deque.poll());
        System.out.println("deque.pop(): " + deque.pop());


        System.out.println(deque);

        deque.clear();
    }

    private static void processAsList(List<Integer> list){
        System.out.println("        list.add(1);\n" +
                "        list.add(1, 2);\n" +
                "        Set<Integer> set = new HashSet<>();\n" +
                "        set.add(3);\n" +
                "        set.add(4);\n" +
                "        list.addAll(set);");
        list.add(1);
        list.add(1, 2);
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        list.addAll(set);
        System.out.println(list);

        set.clear();
        set.add(110);
        set.add(111);
        list.addAll(3, set);

        System.out.println("        set.clear();\n" +
                "        set.add(110);\n" +
                "        set.add(111);\n" +
                "        list.addAll(3, set);");
        System.out.println(list);

        list.set(3, 222);
        System.out.println("        list.set(3, 222);");
        System.out.println(list);
        list.clear();
    }
}
