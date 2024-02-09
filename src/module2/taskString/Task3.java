package src.module2.taskString;

public class Task3 {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }



    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)){
                    result ++;
                }
            }
            stones = stones.replaceAll(jewels.charAt(i) + "", "");
        }
        return result;
    }
}
