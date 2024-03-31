package src.module3.generics;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> integers1 = List.of(1, 3, 5, 7);
        List<Integer> integers2 = List.of(2, 4, 8, 10);

        List<String> strings1 = List.of("Red", "Green", "Blue");
        List<String> strings2 = List.of("White", "Black", "Orange", "Pink");


        System.out.println(mergeLists(integers1,integers2));
        System.out.println(mergeLists(strings1,strings2));

    }

    private static <K> List<K> mergeLists(List<K> list1, List<K> list2){
        ArrayList<K> ks = new ArrayList<>();
        ks.addAll(list1);
        ks.addAll(list2);
        return ks;
    }
}
