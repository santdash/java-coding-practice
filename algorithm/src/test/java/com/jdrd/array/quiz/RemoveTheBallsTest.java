package com.jdrd.array.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveTheBallsTest {

    @Test
    void finLengthSimple() {
        int[] color = { 1, 3, 3, 1};
        int[] radius = { 2, 5, 5, 2 };

        assertEquals(0, RemoveTheBalls.finLength(4, color, radius));
    }

    @Test
    void finLengthSimple_1() {
        int[] color = { 1, 1, 3, 3, 1};
        int[] radius = { 2, 2, 5, 5, 2 };

        assertEquals(1, RemoveTheBalls.finLength(5, color, radius));
    }

    @Test
    void finLengthComplex() {
        int[] color = { 1, 4, 3, 3, 4, 1};
        int[] radius = { 2, 6, 5, 5, 6, 2 };

        assertEquals(0, RemoveTheBalls.finLength(6, color, radius));
    }

    @Test
    void finLengthComplex_1() {

        int[] color =  {61, 52, 62, 9, 7, 3, 73, 33, 36, 33, 33, 73, 73, 73, 73 };
        int[] radius = {72, 65, 1, 69, 78, 82, 38, 3, 72, 38, 38, 38, 38, 38, 38 };

        assertEquals(9, RemoveTheBalls.finLength(15, color, radius));
    }
    @Test
    void finLengthComplex_2() {

        int[] color =  {80,95,19,95,9,32,93,96,59,93,59,93,59,93,59,59,93,59,59,93,93,59,93,59,93,59,59,59,59,93,93,59,93,59,59,59,59,93,59,59,59,59,59,59,59,59,59,59,59,59,59};
        int[] radius = {93,49,77,59,77,34,63,42,18,34,18,34,18,34,34,34,18,34,34,34,18,34,18,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34 };

        assertEquals(21, RemoveTheBalls.finLength(51, color, radius));
    }




}