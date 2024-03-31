package src.module3.generics;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        getSumEvenOddNumbers(List.of(1, 2, 3, 4, 5, 6, 7));
        getSumEvenOddNumbers(List.of(2.0, 1.5, 4.5, 2.5, 1.5));

    }

    private static <K> void getSumEvenOddNumbers(List<K> list){
        double oddSum = 0;
        double evenSumm =  0;
        for (K k : list) {
            Double val = Double.valueOf(k.toString());
            if (val % 2 == 0) {
                evenSumm += val;
            } else {
                oddSum += val;
            }
        }
        System.out.println("Sum of even numbers: " + evenSumm);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
