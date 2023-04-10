package com.jdrd.array.special.mooresvoting;


/** This algorithm works only if the element has clear majority. i.e. more than 50% */
public class MajorityElement {


    private static int majorityCandidate(int[] input){
        int candidateIndex = 0;
        int count = 1;

        for ( int i = 1; i < input.length; i++ ){
            if ( input[i] == input[candidateIndex])
                count++;
            else
                count--;

            if ( count == 0 ){
                candidateIndex = i;
                count = 1;
            }
        }
        return input[candidateIndex];
    }

    public static int getWinner(int[] input){
        int candidate = majorityCandidate(input);
        int count = 0;
        for (int element : input) {
            if (element == candidate) {
                count++;
                if (count > input.length / 2)
                    return element;
            }
        }
        return -1;
    }

}
