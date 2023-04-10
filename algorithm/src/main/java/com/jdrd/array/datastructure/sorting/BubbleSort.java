package com.jdrd.array.datastructure.sorting;

import java.util.function.BiFunction;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are
 * in the wrong order.
 * This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
 * However, it can be optimized for smaller data sets and if less sorting is required.
 */
public class BubbleSort {
    public static void sortAscending(int[] input) {
        sort(input, ( a, b ) -> a > b);
    }

    public static void sortDescending(int[] input) {
        sort(input, ( a, b ) -> a < b);
    }

    private static void sort(int[] input, BiFunction<Integer, Integer, Boolean> compareOp) {
        int n = input.length;
        while (n > 0) {
            /* Every iteration would move the largest/smallest element to the end, so the n-- is for reducing number
            * of inner loop iterations.  while(true) would also work, just inner loop would iteration more times */
            n--;
            boolean swapped = false;
            for (int i = 0; i < n; i++) {
                if (compareOp.apply(input[i], input[i + 1])) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
