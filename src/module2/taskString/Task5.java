package src.module2.taskString;

public class Task5 {

    public static void main(String[] args) {
        String input = "(al)G(al)()()G";
        System.out.println(interpret(input));
    }


    public static String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }
}
