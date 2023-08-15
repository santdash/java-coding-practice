package com.jcp.forkjoin.recursiveaction;

import java.util.concurrent.RecursiveAction;

public class DoubleAction extends RecursiveAction {

    private final int[] input;
    private final int start;
    private final int end;

    public DoubleAction(int[] input, int start, int end) {
        this.input = input;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {

        if (end - start < 10){
            for ( int i = start; i < end; i++ ){
                input[i] = input[i] * 2;
            }
            return;
        }

        int mid = start + ( end - start ) / 2;
        DoubleAction doubleAction1 = new DoubleAction(input, start, mid);
        DoubleAction doubleAction2 = new DoubleAction(input, mid, end);

        invokeAll(doubleAction1, doubleAction2);

    }
}
