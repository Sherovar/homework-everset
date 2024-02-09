package src.module2.taskString;

public class Task1 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }


    public static String defangIPaddr(String address) {
        // it's your code
        return address.replace(".","[.]");
    }
}
