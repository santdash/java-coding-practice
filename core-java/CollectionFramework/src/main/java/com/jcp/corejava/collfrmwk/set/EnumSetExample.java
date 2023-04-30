package com.jcp.corejava.collfrmwk.set;

import java.util.EnumSet;

public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet<SingleDigit> lessThanFiveSet = EnumSet.range(SingleDigit.ONE, SingleDigit.FOUR);
        System.out.println("LessThan 5: ");
        lessThanFiveSet.forEach(System.out::println);

        EnumSet<SingleDigit> all = EnumSet.allOf(SingleDigit.class);
        System.out.println("All: ");
        all.forEach(System.out::println);

        EnumSet<SingleDigit> laterAdd = EnumSet.noneOf(SingleDigit.class);
        laterAdd.add(SingleDigit.NINE);
        System.out.println("Later adds:");
        laterAdd.forEach(System.out::println);

    }

    private enum SingleDigit {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE;

    }
}
