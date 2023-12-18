package src.module1;

public class WhileLoops {
    public static void main(String[] args) {
        while17("Hello java");
    }


    /*    **while1.** **It is necessary that the program displays the following sequence on the screen:**

                7 14 21 28 35 42 49 56 63 70 77 84 91 98*/
    public static void while1() {
        int num = 7;
        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }
    }

    /*            **while2**. **It is necessary to output the following sequence of numbers to the console:**

                1 2 4 8 16 32 64 128 256 512*/
    public static void while2() {
        int num = 1;
        while (num <= 512) {
            System.out.println(num + " ");
            num *= 2;
        }
    }

    /*
     **while3. Write a Program to print Prime factors in java**
     */


    /*
     **while4**. **Write a Program to check Prime numbers or Not**
     */
    public static boolean while4(int num) {
        int tmp = 2;
        while (tmp < num) {
            if (num % tmp++ == 0)
                return false;
        }

        return true;
    }

    /*
     **while5**. **Write a Program to print Factors of a Positive Integer**
     */
    public static void while5(int num) {
        int tmp = 1;
        while (tmp <= num) {
            if (num % tmp == 0)
                System.out.print(tmp + " ");
            tmp++;
        }

    }

    /*
     **while6. Write a Program to print Factors of a Negative Integer**
     */
    public static void while6(int num) {
        int tmp = -1;
        while (tmp >= num) {
            if (num % tmp == 0)
                System.out.print(-tmp + " ");
            tmp--;
        }

    }

    /*
     **while7**. **Write a Program to Check Given Number is a Palindrome or Not**
     */
    public static boolean while7(int num) {
        int reverse = 0;
        int tmp = num;
        while (tmp != 0) {
            reverse = +reverse * 10 + tmp % 10;
            tmp /= 10;
        }
        return num == reverse;
    }

    /*
     **while8**. **Write a Program to Check Given String is a Palindrome or Not**
     */
    public static boolean while8(String input) {
        String reverse = "";
        int pos = input.length() - 1;
        while (pos >= 0) {
            reverse += input.charAt(pos--);
        }
        return input.equals(reverse);
    }

    /*
     **while9**. **Write Java program to print bits that need to be flipped to convert a number to another number**
     */
    public static void while9(int a, int b) {
        String first = "";
        while (a > 0) {
            if (a % 2 == 0)
                first = "0" + first;
            else
                first = "1" + first;
            a /= 2;
        }
                String second = "";
        while (b > 0) {
            if (b % 2 == 0)
                second = "0" + second;
            else
                second = "1" + second;
            b /= 2;
        }
        String res = "";

        int pos;
        System.out.println(res);


    }


    /*
     **while10**. **Write Java program to Count the number of bits to be flipped to convert a number to another number**
     */

    /*
     **while11. Write Java program to Round off an integer number to the next lower multiple of 2**
     */

    /*
     **while12. Write Java program to Find the position of MSB bit of an integer number**
     */

    /*
     **while13. Write Java program to Count the total HIGH bits in the given number**
     */

    /*
     **while14. Write Java program to Implement infinite loop using do-while loop**
     */
    public static void while14(){
        do {
        }
        while (true);
    }

    /*
     **while15. Write Java program to Implement infinite loop using while loop**
     */
    public static void while15(){
        while (true){
        }
    }

    /*
     **while16. Write Java program to Implement infinite loop using for loop**
     */
    public static void while16(){
        for (; true;) {
        }
    }

    /*
     **while17. Write Java program to Print string in hexadecimal format**
     */
    public static void while17(String input){
        int pos = 0;
        String res = "";
        while (pos < input.length()){
            int ch = input.charAt(pos);
            String hex = "";
            while (ch > 0){
                int tmp = ch % 16;
                if (tmp < 10)
                    hex = tmp + hex;
                else
                    hex = switch (tmp){
                    case 10 -> 'A';
                    case 11 -> 'B';
                    case 12 -> 'C';
                    case 13 -> 'D';
                    case 14 -> 'E';
                    case 15 -> 'F';
                        default -> '?';
                    } + hex;
                ch /= 16;

            }
            pos++;
            res += hex;
        }
        System.out.println(res);
    }
}
