package src.module3.generics;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> strList = List.of("Red", "Green", "Blue", "Orange", "White");

        System.out.println(getIndex(intList,3));
        System.out.println(getIndex(strList,"6"));

    }

    private static <K> int getIndex(List<K> list, K element){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element))
                return i;
        }
        return -1;
    }
}
