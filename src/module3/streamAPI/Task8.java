package src.module3.streamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {
        int min = Stream.of(1, 17, 54, 14, 14, 33, 45, -11)
                .mapToInt(x -> x)
                .sorted()
                .skip(1)
                .min()
                .orElse(0);

        int max = Stream.of(1, 17, 54, 14, 14, 33, 45, -11)
                .sorted(Comparator.reverseOrder())
                .mapToInt(x -> x)
                .skip(1)
                .max()
                .orElse(0);

        System.out.println("Second smallest element:" + min);
        System.out.println("Second largest element:" + max);
    }
}
