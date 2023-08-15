package com.jcp.forkjoin.recursivetask;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskDemo {
    public static void main(String[] args) {
        int[] input = new int[100];
        for ( int i = 0; i < input.length; i++ ){
            input[i] = i;
        }
        long currentTime = System.currentTimeMillis();
        SumTask sumTask = new SumTask(input,0, input.length );
        ForkJoinPool pool = new ForkJoinPool();
        Integer sum = pool.invoke(sumTask);
        System.out.println("Sum is: " + sum + " TimeTaken using ForkJoinTask: " + (System.currentTimeMillis() - currentTime) + "ms");

        currentTime = System.currentTimeMillis();
        sum = sumTask.timeConsumingSum( 0, input.length);

        System.out.println("Sum is: " + sum + " TimeTaken single threaded: " + (System.currentTimeMillis() - currentTime) + "ms");

    }
}
