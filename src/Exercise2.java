package src;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        task7();
    }

    /*1. Write a  program to find maximum between two numbers*/
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(Math.max(num1, num2));
    }

    /*2. Write a  program to find maximum between three numbers*/
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(Math.max(num1, Math.max(num2, num3)));
    }

    /*3. Write a  program to check whether a number is negative, positive or zero*/
    public static void task3() {
        int a = new Scanner(System.in).nextInt();
        if (a > 0)
            System.out.println("POSITIVE");
        else if (a < 0)
            System.out.println("NEGATIVE");
        else
            System.out.println("ZERO");

    }

    /*4. Write a  program to check whether a number is divisible by 5 and 11 or not*/
    public static void task4() {
        int a = new Scanner(System.in).nextInt();
        if (a % 5 == 0)
            System.out.println("NUMBER DIVISIBLE ON 5");
        if (a % 11 == 0)
            System.out.println("NUMBER DIVISIBLE ON 11");
        else
            System.out.println("NUMBER NOT DIVISIBLE ON 5 OR 11");
    }

    /*5. Write a  program to check whether a number is even or odd*/
    public static void task5() {
        int a = new Scanner(System.in).nextInt();
        if (a % 2 == 0)
            System.out.println("NUMBER IS EVEN");
        else
            System.out.println("NUMBER IS ODD");
    }

    /*6. Write a  program to check whether a year is leap year or not*/
    public static void task6() {
        int a = new Scanner(System.in).nextInt();
        System.out.println("Year is leap" + (a % 4 == 0));

    }

    /*7. Write a  program to check whether a character is alphabet or not*/
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if ((c <= 90 && c >= 65) || (c <= 122 && c >= 97))
            System.out.println("Char is alphabetical");
        else
            System.out.println("Char is not alphabetical");
    }

    /*8. Write a  program to input any alphabet and check whether it is vowel or consonant*/
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'y' || c == 'u' || c == 'i' || c == 'o' || c == 'A' || c == 'E' || c == 'Y' || c == 'U' || c == 'I' || c == 'O')
            System.out.println("Char is vowel");
        else if ((c <= 90 && c >= 65) || (c <= 122 && c >= 97))
            System.out.println("Char is consonant");
        else
            System.out.println("Char is not alphabetical");
    }

    /*9. Write a  program to input any character and check whether it is alphabet, digit or special character*/
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if (c > 48 && c < 57)
            System.out.println("Char is digit");
        else if ((c <= 90 && c >= 65) || (c <= 122 && c >= 97))
            System.out.println("Char is alphabetical");
        else
            System.out.println("Char is special character");
    }

    /*10. Write a  program to check whether a character is uppercase or lowercase alphabet*/
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if (c <= 90 && c >= 65)
            System.out.println("Char is uppercase");
        else if (c <= 122 && c >= 97)
            System.out.println("Char is lowercase");
    }

    /*11. Write a  program to input week number and print week day*/
    public static void task11() {
        int a = new Scanner(System.in).nextInt();
        switch (a) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
        }
    }

    /*12. Write a  program to input month number and print month Name*/
    public static void task12() {
        int a = new Scanner(System.in).nextInt();
        switch (a) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;

        }

    }

    /*13. Write a  program to count total number of notes in given amount*/
    public static void task13() {
        System.out.println("Введите суму:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите номинал купюры:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Количество купюр: " + (a / b));
    }

    /*14. Write a  program to input angles of a triangle and check whether triangle is valid or not*/
    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st angle: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd angle: ");
        int b = scanner.nextInt();
        System.out.println("Input 3rd angle: ");
        int c = scanner.nextInt();
        if ((a + b + c) <= 180)
            System.out.println("Triangle exist");
        else
            System.out.println("Triangle doesn't exist");
    }

    /*15. Write a  program to input all sides of a triangle and check whether triangle is valid or not*/
    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st side: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd side: ");
        int b = scanner.nextInt();
        System.out.println("Input 3rd side: ");
        int c = scanner.nextInt();
        if ((a + b) <= c || (c + b) <= a || (a + c) <= b)
            System.out.println("Triangle doesn't exist");
        else
            System.out.println("Triangle exist");

    }

    /*16. Write a  program to check whether the triangle is equilateral, isosceles or scalene triangle*/
    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st side: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd side: ");
        int b = scanner.nextInt();
        System.out.println("Input 3rd side: ");
        int c = scanner.nextInt();
        if (a == b && b == c)
            System.out.println("equilateral");
        else if (a != b && b != c && a != c)
            System.out.println("scalene");
        else
            System.out.println("isosceles");


    }

    /*17. Write a  program to find all roots of a quadratic equation*/
    public static void task17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A: ");
        int a = scanner.nextInt();
        System.out.println("Input B: ");
        int b = scanner.nextInt();
        System.out.println("Input C: ");
        int c = scanner.nextInt();
        double d = b * b - 4 * a * c;
        if (d == 0)
            System.out.println("root = " + (-b / (2 * a)));
        else if (d > 0) {
            System.out.println("root 1 = " + ((-b + Math.pow(d, 0.5) / (2 * a))));
            System.out.println("root 2 = " + ((-b - Math.pow(d, 0.5)) / (2 * a)));
        } else
            System.out.println("NO ROOTS");
    }

    /*18. Write a  program to calculate profit or loss*/
    public static void task18() {
    }

    /*19. Write a  program to input marks of five subjects Physics,
     Chemistry, Biology, Mathematics and Computer. Calculate percentage and
     grade according to following:**

     - Percentage >= 90% : Grade A
     - Percentage >= 80% : Grade B
     - Percentage >= 70% : Grade C
     - Percentage >= 60% : Grade D
     - Percentage >= 40% : Grade E
     - Percentage < 40% : Grade F*/
    public static void task19() {
        int a = new Scanner(System.in).nextInt();
        if (a >= 90)
            System.out.println("GRADE A");
        else if (a >= 80)
            System.out.println("GRADE B");
        else if (a >= 70)
            System.out.println("GRADE C");
        else if (a >= 60)
            System.out.println("GRADE D");
        else if (a >= 40)
            System.out.println("GRADE E");
        else
            System.out.println("GRADE F");

    }

    /*20. Write a  program to input basic salary of an employee and calculate its Gross salary according to following:**

     - Basic Salary <= 10000 : HRA = 20%, DA = 80%
     - Basic Salary <= 20000 : HRA = 25%, DA = 90%
     - Basic Salary > 20000 : HRA = 30%, DA = 95%*/
    public static void task20() {
    }

    /*21. Write a  program to input electricity unit charges and calculate total electricity bill according to the given condition:**

     - For first 50 units Rs. 0.50/unit
     - For next 150 units Rs. 0.75/unit
     - For next 250 units Rs. 1.20/unit
     - For unit above 250 Rs. 1.50/unit
     - An additional surcharge of 20% is added to the bill*/
    public static void task21() {
        int units = new Scanner(System.in).nextInt();
        double res = 0;
        while (units > 0) {
            if (units > 450) {
                res += (units - 450) * 1.5;
                units -= 250;
            } else if (units > 200) {
                res += (units - 150) * 1.2;
                units -= 150;
            } else if (units > 50) {
                res += (units - 50) * 0.75;
                units -= 50;
            } else {
                res += units * 0.5;
                units = 0;
            }
        }

        System.out.println(res * 1.2);
    }

    /*22. while purchasing certain items, a discount of 10% is offered
    if the quantity purchased is more than 100. If quantity and price per
    item are input through the keyboard, write a program to calculate the
    total expenses*/
    public static void task22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Input price per item: ");
        int price = scanner.nextInt();
        if (quantity > 100)
            System.out.println(quantity * price * 0.9);
        else
            System.out.println(quantity * price);
    }

    /*23. The current year and the year in which the employee joined
    the organization are entered through the keyboard. If the number of
    years for which the employee has served the organization is greater than
    3 then a bonus of Rs. 2500/- is given to the employee. If the years of
    service are not greater than 3, then the program should do nothing*/
    public static void task23() {
    }

    /*24. If his basic salary is less than Rs. 1500, then HRA = 10% of
     basic salary and DA = 90% of basic salary. If his salary is either equal
     to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
     If the employee's salary is input through the keyboard write a program
     to find his gross salary***/
    public static void task24() {
    }
}
