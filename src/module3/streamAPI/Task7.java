package src.module3.streamAPI;

import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) {
        int max = Stream.of(1, 17, 54, 14, 14, 33, 45, -11)
                .mapToInt(x -> x)
                .max()
                .orElse(0);
        int min = Stream.of(1, 17, 54, 14, 14, 33, 45, -11)
                .mapToInt(x -> x)
                .min()
                .orElse(0);

        System.out.println("Maximum value of the said list:" + max);
        System.out.println("Minimum value of the said list:" + min);
    }
}
