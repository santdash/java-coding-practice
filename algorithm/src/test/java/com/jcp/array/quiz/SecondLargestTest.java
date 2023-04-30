package com.jcp.array.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    @Test
    void find() {
        int[] arr = { 2, 5, 4, 7, 6 };
        assertEquals(6, SecondLargest.find(arr));

        arr = new int[1];
        arr[0] = 100;
        assertEquals(-1, SecondLargest.find(arr));
    }
}