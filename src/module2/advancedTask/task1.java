package src.module2.advancedTask;

public class task1 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }


    public static String defangIPaddr(String address) {
        // it's your code
        return address.replace(".","[.]");
    }
}
