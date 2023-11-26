package src;

public class ExerciseLoops {
    public static void main(String[] args) {
        printReversePyramid();
        
    }

    public static void printReversePyramid(){
        for (int i = 0; i < 5 ; i++) {
            String tmp = "";
            char a = 'A';
            for (int j = 0; j < 9 - 2 * i; j++) {
                tmp += a++;
            }
            for (int j = i; j < 2 * i; j++) {
                tmp = " " + tmp;
            }
            System.out.println(tmp);
        }
    }

    public static void printNumberPattern(){
        int num = 1;
        for (int i = 0; i < 5; i++) {
            String tmp = "";
            for (int j = 0; j <= i; j++) {
                tmp += num++ + " ";
            }
            System.out.println(tmp);
        }
    }

    public static void printPyramid(){
        char a = 'A';
        for (int i = 0; i < 5; i++) {
            String tmp = "";
            for (int j = 0; j < 5 - i; j++) {
                tmp += " ";
            }
            for (int j = 0; j <= i; j++) {
                tmp += a + " ";
                a++;
            }
            System.out.println(tmp);
        }
    }


}
