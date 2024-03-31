package src.module3.streamAPI;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        double v = Stream.of(1, 3, 6, 8, 10, 18, 36)
                .mapToInt(x -> x)
                .average()
                .orElse(0);

        System.out.println(v);
    }
}
