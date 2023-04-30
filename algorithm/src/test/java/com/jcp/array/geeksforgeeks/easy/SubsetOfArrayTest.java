package com.jcp.array.geeksforgeeks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsetOfArrayTest {

    @Test
    void isSubset() {
        long[] a1 = {1, 2, 3, 4, 5, 1, 1, 1};
        long[] a2 = {1, 2, 3, 1};

        assertEquals("Yes", SubsetOfArray.isSubset(a1, a2, 8, 4));
    }

    @Test
    void isSubset_1() {
        long[] a1 = {1, 2, 3, 4, 5};
        long[] a2 = {1, 2, 3, 1};

        assertEquals("No", SubsetOfArray.isSubset(a1, a2, 5, 4));
    }
}