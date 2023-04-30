package com.jcp.array.quiz;

/**
 * Given an array arr of distinct elements of size N, the task is to rearrange the elements of the array in a zig-zag
 * fashion so that the converted array should be in the below form:
 * arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n].
 */
public class ZigZag {

    public static void execute(int[] input){
            for ( int i = 1; i < input.length ; i = i + 2){
                // Compare with Left.
                if ( input[i - 1] > input[i] )
                    swap(input, i - 1, i);

                // Compare with right. unless it exceeds array length.
                if ( i + 1 < input.length && input[i + 1] > input[i])
                    swap(input, i + 1, i);
            }
    }

    private static void swap(int[] input, int left, int right){
        int temp = input[left];
        input[left] = input[right];
        input[right] = temp;
    }
}
