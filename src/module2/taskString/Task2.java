package src.module2.taskString;

public class Task2 {


    public static void main(String[] args) {
        String[] strings = new String[]{"++X","++X","X++"};
        System.out.println(incDecOperation(0,strings));
    }



    public static int incDecOperation(int initial, String[] input){
        for (String s : input) {
            if (s.contains("++")){
                initial++;
            } else {
                initial--;
            }
        }
        return initial;
    }
}
