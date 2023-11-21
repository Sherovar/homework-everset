package src;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        System.out.println(for22("10011100"));  //156
    }


    /*
     **1. Write a program to print all natural numbers from 1 to n**
     */
    public static void for1(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(i + 1);
        }
    }

    /*
     **2. Write a program to print all natural numbers in reverse**
     */
    public static void for2(int num) {
        for (int i = num; i > 0; i++) {
            System.out.println(i);
        }
    }

    /*
     **3. Write a program to print tables**
     */
    public static void for3(int num){
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    /*
     **4. Write a program to print reverse tables**
     */
    public static void for4(int num){
        for (int i = 10; i > 0; i--) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    /*
     **5. Write a program to print all alphabets from a to z**
     */
    public static void for5() {
        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('a' + i));
        }
    }

    /*
     **6. Write a program to print reverse alphabets from Z to A**
     */
    public static void for6() {
        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('Z' - i));
        }
    }

    /*
     **7. Write a program to print all even numbers between 1 to 100**
     */
    public static void for7() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    /*
     **8. Write a program to print all odd number between 1 to 100**
     */

    public static void for8() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }
    /*
     **9. Write a program to find sum of all natural numbers between 1 to n**
     */

    public static int for9(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    /*
     **10. Write a program to find sum of all even numbers between 1 to n**
     */
    public static int for10(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                sum += i;
        }
        return sum;
    }

    /*
     **11. Write a program to find sum of all odd numbers between 1 to n**
     */
    public static int for11(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        return sum;
    }


    /*
     **12. Write a program to print the ASCII values**
     */
    public static void for12(){
        for (int i = 0; i < 255; i++) {
            System.out.println(i + " equal " + (char) i);
        }
    }

    /*
     **13. Write a program to find the factorial value of any number**
     */
    public static long for13(int num){
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    /*
     **14. Write a program to find the value of one number raised to the power of another**
     */
    public static long for14(int num, int pow){
        long res = 1;
        if (pow == 0)
            return 1;
        else if (pow > 0){
            for (int i = 0; i < pow; i++) {
                res *= num;
            }
        }
        else {
            for (int i = 0; i < pow; i++) {
                res /= num;
            }
        }
        return res;
    }

    /*
     **15. write a program to reverse the given Digits**
     */
    public static int for15(int num){
        String numString = String.valueOf(num);
        String res = "";
        for (int i = numString.length() - 1; i >= 0; i--) {
            res += numString.charAt(i);
        }
        return Integer.parseInt(res);
        }

    /*
     **16. write a program to sum of its Digits**
     */
    public static int for16(int num){
        int res = 0;
        for (int i = 0; i < 13; i++){
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    /*17. write a program to Check Whether
    a Given Number is Prime or Not*/
    public static boolean for17(int num){
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    /*
     **18. Write a program to calculate HCF(Highest Common Factor) of Two given number**
     */
    public static int for18(int a, int b){
        if (a % b == 0)
            return b;
        if (b % a == 0)
            return a;
        int lowestMiddle = a < b ? a /2 : b / 2;
        for (int i = lowestMiddle; i > 0 ; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    /*
            **19. Write a program to enter the numbers till the user wants and
    at the end it should display the count of positive, negative and zeros
    entered**
*/
    public static void for19(int num){
        Scanner scanner = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;
        for (int i = 0; i < num; i++) {
            int tmp = scanner.nextInt();
            if (tmp == 0)
                countZeros++;
            else if (tmp > 0)
                countPositive++;
            else countNegative++;
            System.out.println("Positive: " + countPositive);
            System.out.println("Negative: " + countNegative);
            System.out.println("Zeros: " + countZeros);
        }
    }

    /*
            **20. Write a program to enter the numbers till the user wants and
    at the end the program should display the largest and smallest numbers
    entered**
*/
    public static void for20(int num){
        int largest = -Integer.MAX_VALUE;
        int lowest = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            int tmp = scanner.nextInt();
            largest = Math.max(largest,tmp);
            lowest = Math.min(lowest,tmp);
        }
        System.out.println("Largest: " + largest);
        System.out.println("Lowest: " + lowest);
    }

    /*
     **21. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9**
     */
    public static int for21(){
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            sum += i % 9 == 0 ? i : 0;
        }
        return sum;
    }

    /*
     **22. Write a program to convert a binary number into a decimal number without using array, function and while loop**
     */
    public static int for22(String binary){
        int res = 0;
        for (int i = binary.length() - 1; i >= 0 ; i--) {
            res += binary.charAt(i) == '0' ? 0 : Math.pow(2 , binary.length() - i - 1);
        }
        return res;
    }

}
