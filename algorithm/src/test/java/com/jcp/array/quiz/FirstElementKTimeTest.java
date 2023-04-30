package com.jcp.array.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstElementKTimeTest {

    @Test
    void getElement_1() {
        int[] input = { 2, 3, 4, 3, 2};
        int result = FirstElementKTime.getElement(input, 2);
        assertEquals(3, result);
    }
}