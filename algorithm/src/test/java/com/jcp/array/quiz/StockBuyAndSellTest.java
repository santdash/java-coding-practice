package com.jcp.array.quiz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StockBuyAndSellTest {

    @Test
    void stockBuySell() {
        int[] input = {394, 100,180,260,310,40,535,695, 21};
        ArrayList<ArrayList<Integer>> result = StockBuyAndSell.stockBuySell(input);
        assertEquals(2, result.size());

        ArrayList<Integer> firstPair = result.get(0);
        ArrayList<Integer> secondPair = result.get(1);

        assertEquals(1, firstPair.get(0));
        assertEquals(4, firstPair.get(1));

        assertEquals(5, secondPair.get(0));
        assertEquals(7, secondPair.get(1));
    }
}