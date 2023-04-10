package com.jdrd.array.special.mooresvoting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityCandidate_1() {
        int[] input = { 2, 2, 1, 1, 3, 3, 2 };
        int result = MajorityElement.getWinner(input);
        assertEquals(-1, result);
    }

    @Test
    void majorityCandidate_2() {
        int[] input = { 2, 2, 1, 1, 1, 1, 3, 3, 2, 4, 5, 6, 7 };
        int result = MajorityElement.getWinner(input);
        assertEquals(-1, result);
    }

    @Test
    void majorityCandidate_3() {
        int[] input = { 2, 2, 1, 1, 1, 1, 3, 3, 2, 4, 5, 6, 7 };
        int result = MajorityElement.getWinner(input);
        assertEquals(-1, result);
    }

    @Test
    void majorityCandidate_4() {
        int[] input = { 2, 2, 2, 1, 1, 2, 3, 3, 2, 1, 2 };
        int result = MajorityElement.getWinner(input);
        assertEquals(2, result);
    }

    @Test
    void majorityCandidate_5() {
        int[] input = { 2, 2, 2, 2, 1, 1, 1, 1 };
        int result = MajorityElement.getWinner(input);
        assertEquals(-1, result);
    }


}