package src;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(17 >> 1);

    }


    public static void isNotEqual(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int first = input / 100;
        int second = input / 10 % 10;
        int third = input % 10;
        if (first == second || second == third || first == third)
            System.out.println(false);
        else System.out.println(true);
    }

    public static void ifExist(){
        int a = 3;
        int b = 4;
        int c = 5;
        if (a + b < c || a + c < b || b + c < a)
            System.out.println(false);
        else System.out.println(true);
    }

    public static void isPossibleToMove(){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if ((x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2))
            System.out.println("POSSIBLE");
        else
            System.out.println("MOVE NOT POSSIBLE");


    }
}
