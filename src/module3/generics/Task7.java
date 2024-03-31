package src.module3.generics;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();

        stringIntegerHashMap.put("Red",1);
        stringIntegerHashMap.put("Blue",3);
        stringIntegerHashMap.put("Green",2);

        hashMap.put("USA","Washington D.C.");
        hashMap.put("Germany", "Berlin");
        hashMap.put("UK", "London");
        hashMap.put("France", "Paris");

        printKeyValue(stringIntegerHashMap);
        printKeyValue(hashMap);


    }

    private static <K,V> void printKeyValue(HashMap<K,V> hashMap){
        for (Map.Entry<K, V> kvEntry : hashMap.entrySet()) {
            System.out.println("Key: " + kvEntry.getKey() + ", value: " + kvEntry.getValue());
        }
    }
}
