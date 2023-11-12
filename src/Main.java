package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    private static void task1() {
        System.out.println("Hello");
        System.out.println("Alisher Namanov");

    }

    private static void task2() {
        int res = 74 + 36;
        System.out.println(res);

    }

    private static void task3() {
        int res = 50 / 3;
        System.out.println(res);

    }

    private static void task4() {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + (-3 * 5 / 8);
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);

    }

    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));

    }

    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(a + " * " + i + " = " + (a * i));
        }

    }

    private static void task8() {
        System.out.println("   J    a   v     v  a\n");
        System.out.println("   J   a a   v   v  a a\n");
        System.out.println("J  J  aaaaa   V V  aaaaa\n");
        System.out.println(" JJ  a     a   V  a     a\n");

    }

    private static void task9() {
        double res = ((25.5 * 3.5 - 3.5 * 3.5)/ (40.5 - 4.5));
        System.out.println(res);

    }

    private static void task10() {
        double dob = 4.0 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        System.out.println(dob);
    }
}