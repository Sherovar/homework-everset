package src.module3.streamAPI;

import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        int evenSum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14)
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();
        int oddSum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14)
                .filter(x -> x % 2 != 0)
                .mapToInt(x -> x)
                .sum();
        System.out.println("Odd sum: " + oddSum);
        System.out.println("Even sum: " + evenSum);
    }
}
