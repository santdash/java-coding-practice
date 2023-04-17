package com.jdrd.array.geeksforgeeks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSubArrayZeroSumTest {

    @Test
    void bruteForce_0() {
        int[] input = {15,-2,2,-8,1,7,10,23};
        assertEquals(5, LargestSubArrayZeroSum.bruteForce(input));
    }

    @Test
    void bruteForce_1() {
        int[] input = {0,-2,2,-8,1,7,10,23};
        assertEquals(6, LargestSubArrayZeroSum.bruteForce(input));
    }

    @Test
    void bruteForce_2() {
        int[] input = {-1, 1, -1, 1};
        assertEquals(4, LargestSubArrayZeroSum.bruteForce(input));
    }

    @Test
    void efficientApproach_1() {
        int[] input = {15,-2,2,-8,1,7,10,23};
        assertEquals(5, LargestSubArrayZeroSum.efficientApproach(input));
    }
    @Test
    void efficientApproach_2() {
        int[] input = {0,-2,2,-8,1,7,10,23};
        assertEquals(6, LargestSubArrayZeroSum.efficientApproach(input));
    }

    @Test
    void efficientApproach_3() {
        int[] input = {-1, 1, -1, 1};
        assertEquals(4, LargestSubArrayZeroSum.efficientApproach(input));
    }

    @Test
    void efficientApproach_4() {
        int[] input = {-1, 1, -1, 1, 4, 3};
        assertEquals(4, LargestSubArrayZeroSum.efficientApproach(input));
    }


}