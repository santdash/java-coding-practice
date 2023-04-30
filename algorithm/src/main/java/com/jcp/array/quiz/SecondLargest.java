package com.jcp.array.quiz;

/** Find the second-largest element in the array
 * Constraint, array can contain only positive numbers.
 * return -1, if it doesn't have second-largest element.
 * */
public class SecondLargest {

    public static int find(int[] input){
        int i =0, second = -1, largest = -1;
        while ( i < input.length){
            if ( input[i] > largest){
                second = largest;
                largest = input[i];
            }

            if ( input[i] != largest && input[i] > second)
                second = input[i];
            i++;
        }
        return second;
    }
}
