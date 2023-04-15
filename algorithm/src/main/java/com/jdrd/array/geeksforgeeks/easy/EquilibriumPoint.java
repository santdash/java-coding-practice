package com.jdrd.array.geeksforgeeks.easy;

/**
 * Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array.
 * Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 * Note: Return the index of Equilibrium point. (1-based index)

 * Example: 1
 *Input:
 * n = 5
 * A[] = {1,3,5,2,2}
 * Output: 3
 * Explanation:
 * equilibrium point is at position 3
 * as elements before it (1+3) =
 * elements after it (2+2).

 * Example: 2
 * Input:
 * n = 1
 * A[] = {1}
 * Output: 1
 * Explanation:
 * Since its the only element hence
 * its the only equilibrium point.
 */
public class EquilibriumPoint {

    public static int get(long[] arr, int n) {

        int start = 0;
        int end = n - 1;
        long leftSum = 0;
        long rightSum = 0;

        while ( start <= end ){

            if ( start == end ){
                if ( leftSum == rightSum)
                    return start + 1;
                else
                    return -1;
            }


            if (leftSum == rightSum) {
                leftSum = leftSum + arr[start];
                start++;

                rightSum = rightSum + arr[end];
                end--;
            }

            if (leftSum < rightSum) {
                leftSum = leftSum + arr[start];
                start++;
            }

            if (rightSum < leftSum) {
                rightSum = rightSum + arr[end];
                end--;
            }

        }
        return -1;
    }
}
