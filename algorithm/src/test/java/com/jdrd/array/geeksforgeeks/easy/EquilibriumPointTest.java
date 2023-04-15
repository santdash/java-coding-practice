package com.jdrd.array.geeksforgeeks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilibriumPointTest {

    @Test
    void findEquilibriumPoint_1() {
        long[] A = {1,3,5,2,2};
        assertEquals(3, EquilibriumPoint.get(A, 5));
    }
    @Test
    void findEquilibriumPoint_2() {
        long[] A = {1};
        assertEquals(1, EquilibriumPoint.get(A, 1));
    }

    @Test
    void findEquilibriumPoint_3() {
        long[] A = {1,2,3};
        assertEquals(-1, EquilibriumPoint.get(A, 3));
    }
        @Test
    void findEquilibriumPoint_4() {
        long[] A = {1,1};
        assertEquals(-1, EquilibriumPoint.get(A, 2));
    }


}