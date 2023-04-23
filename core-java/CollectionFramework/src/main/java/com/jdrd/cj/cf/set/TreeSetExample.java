package com.jdrd.cj.cf.set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        System.out.println("        integerTreeSet.add(15);\n" +
                "        integerTreeSet.add(16);\n" +
                "        integerTreeSet.add(14);\n" +
                "        integerTreeSet.add(17);\n" +
                "        integerTreeSet.add(13);\n" +
                "        integerTreeSet.add(18);\n" +
                "        integerTreeSet.add(12);\n" +
                "        integerTreeSet.add(23);\n" +
                "        integerTreeSet.add(25);");

        integerTreeSet.add(15);
        integerTreeSet.add(16);
        integerTreeSet.add(14);
        integerTreeSet.add(17);
        integerTreeSet.add(13);
        integerTreeSet.add(18);
        integerTreeSet.add(12);
        integerTreeSet.add(23);
        integerTreeSet.add(25);

        System.out.println("Data: " +integerTreeSet);

        System.out.println("=============SortedSet methods===========");
        System.out.println("integerTreeSet.first(): " + integerTreeSet.first());
        System.out.println("integerTreeSet.last(): " + integerTreeSet.last());
        System.out.println("integerTreeSet.headSet(14): " +integerTreeSet.headSet(14));
        System.out.println("integerTreeSet.tailSet(14):" +integerTreeSet.tailSet(14));
        System.out.println("integerTreeSet.subSet(13, 15): " +integerTreeSet.subSet(13, 15));
        System.out.println("=============NavigableSet methods===========");
        System.out.println("Data: " +integerTreeSet);
        System.out.println("integerTreeSet.ceiling(21): " + integerTreeSet.ceiling(21));
        System.out.println("integerTreeSet.floor(21): "+integerTreeSet.floor(21));
        System.out.println("integerTreeSet.higher(14): " +integerTreeSet.higher(14));
        System.out.println("integerTreeSet.lower(14): " +integerTreeSet.lower(14));
        System.out.println("integerTreeSet.headSet(14, true): " +integerTreeSet.headSet(14, true));
        System.out.println("integerTreeSet.tailSet(14, false): " +integerTreeSet.tailSet(14, false));
        System.out.println("integerTreeSet.subSet(13, false, 15, true): " +integerTreeSet.subSet(13, false, 15, true));
        System.out.println("TreeSet Before Polls: " + integerTreeSet);
        System.out.println("integerTreeSet.pollFirst(): " +integerTreeSet.pollFirst());
        System.out.println("integerTreeSet.pollLast(): " +integerTreeSet.pollLast());
        System.out.println("TreeSet After Polls: " + integerTreeSet);

    }
}
