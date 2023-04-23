package com.jdrd.cj.cf.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> animalSet = new LinkedHashSet<>();
        System.out.println("        animalSet.add(\"Bat\");\n" +
                "        animalSet.add(\"Cat\");\n" +
                "        animalSet.add(\"Alligator\");\n" +
                "        animalSet.add(\"Dog\");");
        animalSet.add("Bat");
        animalSet.add("Cat");
        animalSet.add("Alligator");
        animalSet.add("Dog");

        animalSet.forEach(System.out::println);
    }
}
