package src.module3.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTask {

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("France");
        strings.add("Great");
        strings.add("Britain");
        strings.add("Italy");


        /*
         **1.** Write a Java program to append the specified element to the end of a linked list.
         */
        strings.add("Germany");

        /*
         **2.** Write a Java program to iterate through all elements in a linked list.
         */
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();
        /*
         **3.** Write a Java program to iterate through all elements in a linked list starting at the specified position.
         */
        for (int i = 2; i < strings.size(); i++) {
            System.out.print(strings.get(i) + " ");
        }
        System.out.println();
        /*
         **4.** Write a Java program to iterate a linked list in reverse order.
         */
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.print(strings.get(i) + " ");
        }
        System.out.println();

        /*
         **5.** Write a Java program to insert the specified element at the specified position in the linked list.
         */
        strings.add(2, "Finland");

        /*
         **6.** Write a Java program to insert elements into the linked list at the first and last positions.
         */
        strings.addFirst("Russia");
        strings.addLast("Denmark");

//**7.** Write a Java program to insert the specified element at the front of a linked list.
        //same as 6
//            **8.** Write a Java program to insert the specified element at the end of a linked list.
        //same as 6

//            **9.** Write a Java program to insert some elements at the specified position into a linked list.
        //same as 5
        /*
         **10.** Write a Java program to get the first and last occurrence of the specified elements in a linked list.
         */
        strings.indexOf("Denmark");
        strings.lastIndexOf("Finland");

//**11.** Write a Java program to display elements and their positions in a linked list.
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Pos: " + i + ", value: " + strings.get(i));
        }

//            **12.** Write a Java program to remove a specified element from a linked list.
        strings.remove("Russia");

//**13.** Write a Java program to remove the first and last elements from a linked list.
        strings.removeFirst();
        strings.removeLast();

        /*
         **14.** Write a Java program to remove all elements from a linked list.
         */
       // strings.clear();

        /*
         **15.** Write a Java program that swaps two elements in a linked list.
         */
        Collections.swap(strings, 2,3);


//            **16.** Write a Java program to shuffle elements in a linked list.
        Collections.shuffle(strings);

//**17.** Write a Java program to join two linked lists.
        //strings.addAll(copy);


        /*
         **18.** Write a Java program to copy a linked list to another linked list.
         */
        LinkedList<String> copy = new LinkedList<>(strings);
        System.out.println(copy);

        /*
         **19.** Write a Java program to remove and return the first element of a linked list.
         */
        String s = copy.removeFirst();
        System.out.println(s);

//**20.** Write a Java program to retrieve, but not remove, the first element of a linked list.
        System.out.println(copy.getFirst());


        /*
         **21.** Write a Java program to retrieve, but not remove, the last element of a linked list.
         */
        System.out.println(copy.getLast());

        /*
         **22.** Write a Java program to check if a particular element exists in a linked list.
         */
        System.out.println(copy.contains("Italy"));

        /*
         **23.** Write a Java program to convert a linked list to an array list.
         */
        List<String> strings1 =  List.copyOf(strings);
        System.out.println(strings1);

//**24.** Write a Java program to compare two linked lists.
        strings.equals(copy);

//**25.** Write a Java program to check if a linked list is empty or not.
        System.out.println(strings.isEmpty());

//**26.** Write a Java program to replace an element in a linked list.
        Collections.replaceAll(strings, "Italy", "Switzerland");
        System.out.println(strings);

    }
}
