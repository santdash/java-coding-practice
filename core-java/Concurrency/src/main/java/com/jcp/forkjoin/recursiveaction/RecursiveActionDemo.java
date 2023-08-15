package com.jcp.forkjoin.recursiveaction;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class RecursiveActionDemo {
    public static void main(String[] args) {

        int[] input = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = i;
        }

        DoubleAction doubleAction = new DoubleAction(input, 0, 1000);
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Void> submit = pool.submit(doubleAction);
        submit.join();
        pool.shutdown();
        System.out.println(Arrays.toString(input));
    }
}
