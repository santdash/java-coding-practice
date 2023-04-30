package com.jcp.array.geeksforgeeks.easy;

import java.util.HashMap;
import java.util.Map;

/** Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

 Example 1:

 Input:
 N = 8
 A[] = {15,-2,2,-8,1,7,10,23}
 Output: 5
 Explanation: The largest subarray with
 sum 0 will be -2 2 -8 1 7.

 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).

 * Constraints:
 * 1 <= N <= 105
 * -1000 <= A[i] <= 1000, for each valid i
 */
public class LargestSubArrayZeroSum {


    /* Check sum of all sub arrays and use the max of the same */
    public static int bruteForce(int[] input) {
        int maxDistance = 0;
        for (int i = 0; i < input.length - 1; i++) {
            int sum = input[i];
            for (int j = i + 1; j < input.length; j++) {
                sum += input[j];
                if (sum == 0) {
                    maxDistance = Math.max(maxDistance, j - i + 1);
                }
            }
        }
        return maxDistance;
    }

    /*  Input = {15,-2,2,-8,1,7,10,23}
    Do a pre sum.
    15 , 13, 15, 7 , 8 15, 25, 48
    Where ever the sum is 0, that index will have the repeated value.
    15 is index 0 and in index 2. i.e. index 1 + index 2 sum is 0.
    15 is again in index 5. i.e. index 1 to index 5 sum is 0.

    Is there any exception!! Try with various test cases.
     */
    public static int efficientApproach(int[] input){

        Map<Integer, Integer> table = new HashMap<>();
        int sum = 0;
        int maxDistance = 0;
        for ( int i = 0; i < input.length; i++ ){
            sum += input[i];

            if ( sum == 0)
                maxDistance = i + 1;

            if ( table.containsKey(sum) ){
                maxDistance = Math.max(maxDistance,i - table.get(sum));
            } else {
                table.put(sum, i);
            }
        }


        return maxDistance;
    }
}
