package src.module3.streamAPI;

import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Stream.of("RED","grEEn","white","Orange","pink")
                .map(String::toLowerCase)
                .forEach(System.out::println);
        Stream.of("RED","grEEn","white","Orange","pink")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
