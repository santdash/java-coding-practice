package com.jdrd.array.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagTest {

    @Test
    void execute_1() {
        int[] input =  {4, 3, 7, 8, 6, 2, 1};
        int[] expected = {3, 7, 4, 8, 2, 6 ,1};
        ZigZag.execute(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void execute_2() {
        int[] input =  {1, 4, 3, 2};
        int[] expected = {1, 4, 2, 3};
        ZigZag.execute(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void execute_3() {
        int[] input =  {9, 8, 7, 6, 5};
        int[] expected = {8, 9, 6, 7, 5};
        ZigZag.execute(input);

        assertArrayEquals(expected, input);
    }
}