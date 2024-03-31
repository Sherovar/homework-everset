package src.module3.collection2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("USA", "Washington DC");
        hashMap.put("Norway", "Oslo");
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");

//        **1.** Write a Java program to associate the specified value with the specified key in a HashMap.
        hashMap.get("USA");

//**2.** Write a Java program to count the number of key-value (size) mappings in a map.
        hashMap.size();

//**3.** Write a Java program to copy all mappings from the specified map to another map.
        Map<String, String> copy = Map.copyOf(hashMap);

//                **4.** Write a Java program to remove all mappings from a map.
        //hashMap.remove()


//                **5.** Write a Java program to check whether a map contains key-value mappings (empty) or not.
        hashMap.containsKey("USA");
        hashMap.containsValue("Oslo");
        hashMap.isEmpty();

//**6.** Write a Java program to get a shallow copy of a HashMap instance.
        // Нипонял


//                **7.** Write a Java program to test if a map contains a mapping for the specified key.
        //same as 5

//                **8.** Write a Java program to test if a map contains a mapping for the specified value.
        //same as 5

//                **9.** Write a Java program to create a set view of the mappings contained in a map.
        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " = " + stringStringEntry.getValue());
        }
        //System.out.println(hashMap);


//**10.** Write a Java program to get the value of a specified key in a map.
        hashMap.get("USA");

//                **11.** Write a Java program to get a set view of the keys contained in this map.
        Set<String> strings = hashMap.keySet();

//                **12.** Write a Java program to get a collection view of the values contained in this map.
        Collection<String> values = hashMap.values();


    }
}
