package src.module3.streamAPI;

import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Stream.of(10, 23, 22, 23, 24, 24, 33, 15, 26, 15)
                .mapToInt(x -> x)
                .distinct()
                .forEach(System.out::println);
    }
}
