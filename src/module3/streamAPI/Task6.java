package src.module3.streamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        Stream.of("Red", "Green", "Blue", "Pink", "Brown")
                .sorted()
                .forEach(x -> System.out.println(x + " "));

        System.out.println();

        Stream.of("Red", "Green", "Blue", "Pink", "Brown")
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println(x + " "));
    }
}
