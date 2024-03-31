package src.module3.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        List<String> strings = List.of("Red", "Green", "Orange");

        System.out.println(getReversedList(integers));
        System.out.println(getReversedList(strings));


    }

    private static <K> List<K> getReversedList(List<K> list){
        ArrayList<K> ks = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            ks.add(list.get(i));
        }
        return ks;
    }
}
