package com.jcp.array.quiz;

import java.util.ArrayList;
import java.util.Stack;

/** The cost of stock on each day is given in an array A[] of size N. Find all the segments of days on which you
 * buy and sell the stock so that in between those days  for which profit can be generated
 * Input:
 * Input[] = {100,180,260,310,40,535,695}
 * Output:
 * ArrayList of 2 ArrayLists. ArrayList would contain the indexes of buying and selling.
 * Explanation:
 * One possible solution is (0 3) (4 6)
 * We can buy stock on day 0,
 * and sell it on 3rd day, which will
 * give us maximum profit. Now, we buy
 * stock on day 4 and sell it on day 6.
 */
public class StockBuyAndSell {

    public static ArrayList<ArrayList<Integer>> stockBuySell(int[] A ){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Stack<Integer> pair = new Stack<>();
        for (int i =0; i < A.length; i++) {
            if (pair.size() == 0) {
                pair.push(i);
                continue;
            }

            if (pair.size() == 1) {
                if (A[pair.get(0)] < A[i]) {
                    pair.push(i);
                    continue;
                }
                pair.pop();
                pair.push(i);
            }

            if (pair.size() == 2) {
                if (A[pair.get(1)] < A[i]) {
                    pair.pop();
                    pair.push(i);
                    continue;
                }
                result.add(new ArrayList<>(pair));
                pair = new Stack<>();
                pair.push(i);
            }
        }
        if ( pair.size() == 2)
            result.add(new ArrayList<>(pair));

        return result;
    }
}
