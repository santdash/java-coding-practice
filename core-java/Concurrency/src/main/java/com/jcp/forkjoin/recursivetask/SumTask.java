package com.jcp.forkjoin.recursivetask;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {

    private final int[] input;
    private final int start;
    private final int end;

    public SumTask(int[] input, int start, int end) {
        this.input = input;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if ( end - start < 10 ) {
            return timeConsumingSum(start, end);
        } else {
            int mid = start + (end - start) / 2;
            SumTask first = new SumTask(input, start, mid);
            SumTask second = new SumTask(input, mid, end);
            first.fork();
            second.fork();
            return  second.join() + first.join();
        }
    }

    Integer timeConsumingSum(int start, int end){
        int sum = 0;

        for (int i = start; i < end; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sum += input[i];
        }
        return sum;
    }


}
