package com.jdrd.array.quiz;

import java.util.HashSet;
import java.util.Set;
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
        Set<Integer> removedIndexes = new HashSet<>();
        Stack<Integer> lastI = new Stack<>();
        while ( j < N ){

            if ( removedIndexes.contains(i) ){
                if ( lastI.size() > 0 ){
                    i = lastI.pop();
                } else {
                    i = j;
                    j++;
                }
                continue;
            }


            if (color[i] == color[j] && radius[i] == radius[j]){
                removedIndexes.add(i);
                removedIndexes.add(j);
                removed++;
            } else {
                if ( lastI.size() == 0 || lastI.peek() != i )
                    lastI.push(i);

                while ( removedIndexes.contains(i + 1) ){
                    i++;
                }
                i++;
            }

            j++;
        }

        removed = 2 * removed;
        return N - removed;
    }
}
