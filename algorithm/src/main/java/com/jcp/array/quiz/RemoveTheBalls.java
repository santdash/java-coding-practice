package com.jcp.array.quiz;

import java.util.Stack;

/** Imagine an imaginary array of length N containing balls. Given 2 arrays color and radius of length N each, where
 * color[i] represents the color of the ith ball while radius[i] represents the radius of ith ball. If two consecutive
 * balls have the same color and size, both are removed from the array. Geek wants to know the length of the final
 * imaginary array.*/
public class RemoveTheBalls {

    public static int finLength(int N, int[] color, int[] radius) {
        int removed = 0;
        int j = 1;
        int i = 0;

        Stack<Integer> lowIndex = new Stack<>();

        while (j < N){

            if (color[i] == color[j] && radius[i] == radius[j]){
                removed++;
                if ( lowIndex.size() > 0 )
                    i = lowIndex.pop();
                else {
                    i = j + 1;
                    j++;
                }
            } else {
                lowIndex.push(i);
                i = j;
            }
            j++;
        }

        removed = 2 * removed;
        return N - removed;
    }
}
