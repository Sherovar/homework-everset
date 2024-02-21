package src.randomTask;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    int t;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



    }

    private static String reverseWordsInSentence(String sentence){
        // Dobby is free -> ybboD si eerf
        // English alphabet; Upper case and lower case; And spaces.
        // length : [1; 2000]
        // Only one space, that will distinct words.
        String[] split = sentence.split(" ");
        String result = "";
        for (String s : split) {
            for (int i = 0; i < s.length(); i++) {
                result += s.charAt(s.length() - 1 - i);
            }
            result += " ";
        }

        return result;
    }



    /*
    Возвращать третье максимальное число в массиве nums. Если третьего максимума не существует, верните максимальное число.

Пример 1:
Входные данные: nums = [1, 2, 3, 4]
Выходные данные: 2

Пример 2:
Входные данные: nums = [1,2]
Выходные данные: 2
     */
    public static int getThirdMax(int[] array){
        Arrays.sort(array);
        int counter = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != array[i - 1]){
                counter++;
            }
            if (counter == 3){
                return array[i];
            }
        }
        return array[0];
    }
}
