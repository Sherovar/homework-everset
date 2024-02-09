package src.module2.taskString;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        String[] word = new String[]{"abc","bcd","aaaa","cbc"};

        System.out.println(Arrays.toString(findWordsContaining(word, 'a')));

    }


    public static int[] findWordsContaining(String[] words, char x) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(x + "")){
                integers.add(i);
            }
        }
        int[] result = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }

        return result;
    }
}
