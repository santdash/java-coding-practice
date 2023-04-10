package com.jdrd.array.datastructure.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testSortAscending() {
        int[] arr = { 56, 31, 11, 93, 41, 10 };
        int[] expected = { 10, 11, 31, 41, 56, 93 };

        BubbleSort.sortAscending(arr);

        assertArrayEquals(expected, arr);

        int[] arr1 = { 5, 4, 3, 2 ,1 };
        int[] expected1 = { 1, 2, 3, 4, 5 };
        BubbleSort.sortAscending(arr1);

        assertArrayEquals(expected1, arr1);

    }

    @Test
    void testSortDescending() {

        int[] arr = { 56, 31, 11, 93, 41, 10 };
        int[] expected = { 93, 56, 41, 31, 11, 10 };

        BubbleSort.sortDescending(arr);

        assertArrayEquals(expected, arr);

    }
}