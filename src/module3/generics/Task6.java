package src.module3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Predicate<Integer> predicateEven = x -> x % 2 == 0;
        Predicate<Integer> predicateOdd = x -> x % 2 != 0;

        System.out.println(getList(integers,predicateEven));
        System.out.println(getList(integers,predicateOdd));

        List<String> strings = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
        Predicate<String> predicateStartsWith = x -> x.startsWith("O");
        Predicate<String> predicateLength = x -> x.length() > 4;


        System.out.println(getList(strings, predicateStartsWith));
        System.out.println(getList(strings, predicateLength));

    }

    private static  <K> ArrayList<K> getList(List<K> list, Predicate<K> predicate){
        ArrayList<K> ks = new ArrayList<>();
        for (K k : list) {
            if (predicate.test(k)){
                ks.add(k);
            }
        }
        return ks;
    }
}
