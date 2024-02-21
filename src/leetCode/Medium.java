package src.leetCode;

import java.util.HashSet;
import java.util.Map;

public class Medium {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();

    }


    public static int minDistance(String word1, String word2) {
        int res =0;

        for (int i = 0; i < word2.length(); i++) {
            if (word2.charAt(i) != word1.charAt(i)){
                res++;
            } else {
                res--;
            }
        }

        return res + word1.length() - word2.length();
    }
    
    
    
    
    

}
