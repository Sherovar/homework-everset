package src.module3.collection2;

import java.util.*;

public class HashSetTask {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("South Afriaca");
        strings.add("Australia");
        strings.add("India");

//        **1.** Write a Java program to append the specified element to the end of a hash set.
        //HashSet has no order

//**2.** Write a Java program to iterate through all elements in a hash list.
        for (String string : strings) {
            System.out.print(string + " ");
        }

//                **3.** Write a Java program to get the number of elements in a hash set.
        System.out.println("\n " + strings.size());

//**4.** Write a Java program to empty an hash set.
        //strings.clear();

//                **5.** Write a Java program to test if a hash set is empty or not.
        System.out.println(strings.isEmpty());

//                **6.** Write a Java program to clone a hash set to another hash set.
        HashSet<String> copy = new HashSet<>(strings);

//                **7.** Write a Java program to convert a hash set to an array.
        List<String> hashSets = List.copyOf(strings);

//**8.** Write a Java program to convert a hash set to a tree set.
        TreeSet<String> strings1 = new TreeSet<>(strings);


//                **9.** Write a Java program to find numbers less than 7 in a tree set.

//**10.** Write a Java program to compare two hash set.
        boolean equals = strings.equals(copy);
        System.out.println(copy);
        System.out.println(strings);
        System.out.println(equals);

//                **11.** Write a Java program to compare two sets and retain elements that are the same.
        strings.retainAll(copy);

//                **12.** Write a Java program to remove all elements from a hash set.
        copy.clear();
    }
}
