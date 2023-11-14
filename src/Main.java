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




    /*1.
  Описать функцию Odd(K) логического типа, возвращающую TRUE,если целый параметр K является нечетным, и FALSE в противном случае.
  С ее помощью найти количество нечетных чисел в наборе из 5 целых чисел.
  even - четный
  odd - нечетный
*/

    static public boolean odd(int num){
        return  num % 2 == 0;
    }




/*
2. Описать функцию Sign(X) целого типа, возвращающую для вещественного числа X следующие значения:
−1, если X < 0; 0, если X = 0; 1, если X > 0.
С помощью этой функции найти значение выражения Sign(A) + Sign(B)
для данных вещественных чисел A и B.
*/
    static public int sign(double num){
        if (num == 0)
            return 0;
        else if(num > 0)
                return 1;
        else
            return -1;
    }
}