package src.module3.streamAPI;

import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        long count = Stream.of("Red", "Green", "Blue", "Pink", "Brown")
                .filter(x -> x.startsWith("B"))
                .count();
        System.out.println("Number of colors starting with 'B': " +  count);
    }
}
