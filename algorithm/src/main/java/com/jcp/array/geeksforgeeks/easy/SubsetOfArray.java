package com.jcp.array.geeksforgeeks.easy;

import java.util.HashMap;
import java.util.Map;

public class SubsetOfArray {

    public static String isSubset( long[] a1, long[] a2, long n, long m) {

        int i = 0;
        Map<Long, Integer> count = new HashMap<>();

        while ( i < n ){
            count.put(a1[i], count.getOrDefault(a1[i], 0) + 1);
            i++;
        }

        i = 0;

        while ( i < m){

            if ( ! count.containsKey(a2[i]) || count.get(a2[i]) <= 0 )
                return "No";
            else {
                count.put(a2[i], count.get(a2[i]) - 1);
            }
            i++;

        }

        return "Yes";
    }
}
