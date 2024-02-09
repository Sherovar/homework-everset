package src.module2.taskString;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        String[] strings1 = new String[]{"ab", "c"};
        String[] strings2 = new String[]{"a", "bc"};
        System.out.println(checkEquivalent(strings1, strings2));
    }


    public static boolean checkEquivalent(String[] word1, String[] word2) {
        return Arrays.toString(word1)
                .replace(", ", "")
                .equals(Arrays.toString(word2)
                        .replace(", ", ""));
    }
}
