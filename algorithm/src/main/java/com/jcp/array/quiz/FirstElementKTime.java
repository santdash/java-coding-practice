package com.jcp.array.quiz;


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of N integers. Find the first element that occurs at least K number of times.
 */
public class FirstElementKTime {

    public static int getElement(int[] input, int k){
        Map<Integer, Integer> countMap= new HashMap<>();
        for (int j : input) {
            countMap.put(j, countMap.getOrDefault(j, 0) + 1);
            if ( countMap.get(j) == k)
                return j;
        }
        return -1;
    }
}
