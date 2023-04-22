package com.jdrd.cj.cf.list;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        Collection<Integer> listAsCollection = new ArrayList<>();
        listAsCollection.add(10);
        listAsCollection.add(11);
        listAsCollection.add(10);
        listAsCollection.add(12);
        System.out.println(listAsCollection);
        listAsCollection.remove(10);
        System.out.println("Size of listAsCollection(After removing 10 once): " + listAsCollection.size());
        System.out.println(listAsCollection);
        System.out.println("Does listAsCollection contains 12: " + listAsCollection.contains(12));

        // Other methods such as addAll, removeAll, containsAll are not used for brevity.

        // Iterator.
        Iterator<Integer> listAsCollectionIterator = listAsCollection.iterator();

        while ( listAsCollectionIterator.hasNext() ){
            Integer next = listAsCollectionIterator.next();
            System.out.println("Removing element: " + next);
            listAsCollectionIterator.remove();
        }
        System.out.println("After removing all elements using iterator: " + listAsCollection);

        // ArrayList as List interface (Only addition operations mentioned)
        List<Integer> listAsListInterface = new ArrayList<>();

        listAsListInterface.add(0, 10);
        listAsListInterface.add(1, 20);
        listAsListInterface.add(2, 40);
        listAsListInterface.add(3, 50);
        listAsListInterface.add(4, 40);


        System.out.println("listAsListInterface after add: " + listAsListInterface);
        listAsListInterface.add(2, 30);
        System.out.println("listAsListInterface after adding 30 to 2nd Index: " + listAsListInterface);

        listAsListInterface.remove(2);
        System.out.println("listAsListInterface after removing 2nd Index: " + listAsListInterface);

        System.out.println("listAsListInterface getting the value at first index: " + listAsListInterface.get(0));

        System.out.println("First and Last Index of 40 " + listAsListInterface.indexOf(40) + ", " + listAsListInterface.lastIndexOf(40));

        // Using ListIterator (Additionally we can traverse the list in backward directory and some additional operation)
        ListIterator<Integer> integerListIterator = listAsListInterface.listIterator(listAsListInterface.size());
        System.out.println("Traversing list in reverse using listIterator... Replacing 40 with 90 and adding 5 to the previous index of 10");
        while(integerListIterator.hasPrevious()){
            Integer val = integerListIterator.previous();
            int prevIndex = integerListIterator.previousIndex();
            System.out.println("Element: " + val + " Previous Index: " + prevIndex);

            // Change 40 to 90.
            if ( val.equals(40) ){
                integerListIterator.set(90);
            }

            // If 10, add 5 (Since iterator is traversing backwards, it will add 5 to the previous index of 10.)
            if ( val.equals(10)){
                integerListIterator.add(5);
            }
        }

        System.out.println("After list iterator modifications: " + listAsListInterface);

        /* No need to check assigning ArrayList to ArrayList. Since all methods in array list are available in list.
        *  Also In Java, we almost never use (except few occasions. Once such example is Stack) concrete class for defining variable(Check Design Patterns for more understanding)
        * ArrayList<Integer> listAsListInterface = new ArrayList<>();
        *  */


    }
}
