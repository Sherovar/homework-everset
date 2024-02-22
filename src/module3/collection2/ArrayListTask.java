package src.module3.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTask {
    public static void main(String[] args) {
        //1. Напишите Java-программу, которая создаст список массивов, добавит в него несколько цветов (строк) и выведет коллекцию на std out.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Red");
        strings.add("Blue");
        strings.add("Yellow");
        //2. Написать Java-программу для итерационного перебора всех элементов списка массива.
        for (int i = 0; i < strings.size(); i++) {
            strings.get(i);
        }
        //3. Write a Java program to insert an element into the array list at the first position.
        strings.add(0, "Black");
        //4. Написать Java-программу для извлечения элемента (по заданному индексу) из заданного списка массивов.
        strings.get(3);
        //5. Написать Java-программу для обновления элемента массива на заданный элемент.
        strings.set(2, "Purple");
        //6. Write a Java program to remove the third element from an array list.
        strings.remove(2);
        //7. Write a Java program to search for an element in an array list.
        strings.contains("Black");
        //8. Write a Java program to sort a given array list.
        Collections.sort(strings);
        //9. Write a Java program to copy one array list into another.
        List<String> stringsNew = List.copyOf(strings);
        //10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(strings);
        //11. Write a Java program to reverse elements in an array list.
        Collections.reverse(strings);
        //12. Написать Java-программу для извлечения части списка массива.
        for (int i = 0; i < strings.size() - 2; i++) {
            strings.get(i);
        }
        //13. Write a Java program to compare two array lists.
        strings.equals(stringsNew);
        //14. Write a Java program that swaps two elements in an array list.
        String tmp = strings.get(1);
        strings.set(1, strings.get(2));
        strings.set(2, tmp);
        //15. Write a Java program to join two array lists.
        strings.addAll(stringsNew);
        //16. Write a Java program to clone an array list to another array list.
        Collections.copy(strings, stringsNew);
        //17. Write a Java program to empty an array list.
        //      strings.removeAll(strings);
        //18. Write a Java program to test whether an array list is empty or not.
        strings.isEmpty();
        //19. Написать Java-программу для обрезки емкости списка массивов.
        strings.trimToSize();
        //20. Написать Java-программу для увеличения размера списка массива.
        strings.ensureCapacity(100);
        //21. Write a Java program to replace the second element of an ArrayList with the указанный элемент.
        int pos = 3;
        tmp = strings.get(1);
        strings.set(1, strings.get(pos));
        strings.set(pos, tmp);
        //22. Write a Java program to print all the elements of an ArrayList using the elements' position.
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Pos = " + i + ": " + strings.get(i));
        }


    }
}
