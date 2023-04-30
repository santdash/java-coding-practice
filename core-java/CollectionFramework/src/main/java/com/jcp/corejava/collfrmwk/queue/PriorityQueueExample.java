package com.jcp.corejava.collfrmwk.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(); // Natural order.
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(35);
        priorityQueue.offer(20);


        System.out.println("Data: (Insert Sequence 10, 30, 35, 20 30) (Balanced Binary Heap)" + priorityQueue);

        System.out.println("Peek: " + priorityQueue.peek());
        System.out.println("Data: After Peek" + priorityQueue);
        System.out.println("Poll: " + priorityQueue.poll());
        System.out.println("Data: After Poll" + priorityQueue);

        // Using reverse comparator.
        Queue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        pQueue.offer(20);
        pQueue.offer(10);
        pQueue.offer(30);

        System.out.println("Data(ReverseComparator): (Insert Sequence 20, 10, 30)(Balanced Binary Heap)" + pQueue);

        System.out.println("Peek(ReverseComparator): " + pQueue.peek());
        System.out.println("Data(ReverseComparator): After Peek" + pQueue);
        System.out.println("Poll(ReverseComparator): " + pQueue.poll());
        System.out.println("Data(ReverseComparator): After Poll" + pQueue);

    }

}
