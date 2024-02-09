package src.module2.taskString;

public class Task6 {

    public static void main(String[] args) {
        String[] strings = new String[]{"alice and bob love leetcode", "i think so too","this is great thanks very much"};
        System.out.println(mostWordsFound(strings));
    }


    public static int mostWordsFound(String[] sentences) {
        int result = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] split = sentences[i].split(" ");
            result = Math.max(split.length, result);
        }

        return result;
    }


}
