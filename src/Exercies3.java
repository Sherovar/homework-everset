package src;

import java.util.Scanner;

public class Exercies3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



    }

    /*25. The marks obtained by a student in 5 different subjects are
input through the keyboard. The student gets a division as per the
following rules: Write a program to calculate the division obtained by
the student
- Percentage above or equal to 60 - First division
- Percentage between 50 and 59 - Second division
- Percentage between 40 and 49 - Third division
- Percentage less than 40 – Fail*/
    public static void task25() {

    }

    /*26. A company insures its drivers in the following cases:
- If the driver is married
- If the driver is unmarried, male & above 30 years of age
- If the driver is unmarried, female & above 25 years of age*/
    public static void task26() {
        System.out.println("Input sex :");
        String sex = scanner.next().toLowerCase();
        System.out.println("Input age: ");
        int age = scanner.nextInt();
        System.out.println("Input marriage: ");
        String marriage = scanner.next().toLowerCase();
        if (marriage.equals("married"))
            System.out.println("INSURED");
        else if (sex.equals("male") && age > 30)
            System.out.println("INSURED");
        else if (sex.equals("female") && age > 25)
            System.out.println("INSURED");
        else
            System.out.println("NOT INSURED");
    }

    /*27. Write a program to calculate the salary as per the following table
Gender	Year of Service	Qualifications	Salary
Male	>= 10	Post - Graduate	15000
	>= 10	Graduate	10000
	< 10	Post - Graduate	10000
	< 10	Graduate	7000
Female	>= 10	Post - Graduate	12000
	>= 10	Graduate	9000
	< 10	Post - Graduate	10000
	< 10	Graduate	6000*/
    public static void task27() {
        System.out.println("Input gender: ");
        String gender = scanner.next().toLowerCase();
        System.out.println("Input years of service: ");
        int yars = scanner.nextInt();
        System.out.println("Input qualification: ");
        String qual = scanner.next().toLowerCase();
        if (gender.equals("male")) {
            if (yars >= 10 && qual.equals("post graduate"))
                System.out.println("Salary is 15000");
            else if (yars >= 10 && qual.equals("graduate"))
                System.out.println("Salary is 10000");
            else if (qual.equals("post graduate"))
                System.out.println("Salary is 10000");
            else if (qual.equals("graduate"))
                System.out.println("Salary is 7000");
        } else if (gender.equals("female")) {
            if (yars >= 10 && qual.equals("post graduate"))
                System.out.println("Salary is 12000");
            else if (yars >= 10 && qual.equals("graduate"))
                System.out.println("Salary is 9000");
            else if (qual.equals("post graduate"))
                System.out.println("Salary is 10000");
            else if (qual.equals("graduate"))
                System.out.println("Salary is 6000");
        }
    }

    /*28. A five-digit number is entered through the keyboard. Write a
program to obtain the reversed number and to determine whether the
original and reversed numbers are equal or not*/
    public static void task28() {
        System.out.println("Input your number");
        int input = scanner.nextInt();
        int res = input / 10000 + input / 1000 % 10 * 10 + input / 100 % 10 * 100 + input / 10 % 10 * 1000 + input % 10 * 10000;
        System.out.println("Reverse nubmer is equal : " + (res == input));
    }

    /*29. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three*/
    public static void task29() {
        System.out.println("Input Ram's age:");
        int ram = scanner.nextByte();
        System.out.println("Input Shyam's age:");
        int shyam = scanner.nextInt();
        System.out.println("Input Ajay's age:");
        int ajay = scanner.nextInt();
        if (ram < shyam && ram < ajay)
            System.out.println("Ram is youngest");
        else if (shyam < ram && shyam < ajay)
            System.out.println("Shyam is youngest");
        else
            System.out.println("Ajay is youngest");
    }

    /*30. Write a program to check whether a triangle is valid or not,
when the three angles of the triangle are entered through the keyboard. A
 triangle is valid if the sum of all the three angles is equal to 180
degrees*/
    public static void task30() {
        System.out.println("Input 1st angle: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd angle: ");
        int b = scanner.nextInt();
        System.out.println("Input 3rd angle: ");
        int c = scanner.nextInt();
        if ((a + b + c) == 180)
            System.out.println("Triangle exist");
        else
            System.out.println("Triangle doesn't exist");
    }

    /*31. Find the absolute value of a number entered through the keyboard*/
    public static void task31() {
        int a = scanner.nextInt();
        System.out.println(Math.abs(a));

    }

    /*32. Given the length and breadth of a rectangle, write a program
to find whether the area of the rectangle is greater than its perimeter.
 For example, the area of the rectangle with length = 5 and breadth = 4
is greater than its perimeter*/
    public static void task32() {
        System.out.println("Input length: ");
        int a = scanner.nextInt();
        System.out.println("Input breadth: ");
        int b = scanner.nextInt();
        if ((a * b) > ((a + b) * 2)){
            System.out.println("Area is bigger than perimeter");
        }
        else if ((a * b) < ((a + b) * 2))
            System.out.println("Perimeter is bigger than area");
        else
            System.out.println("Area equal perimeter");
    }

    /*33. A certain grade of steel is graded according to the following conditions**

     1. Hardness must be greater than 50
     2. Carbon content must be less than 0.7
     3. Tensile strength must be greater than 5600

     The grades are as follows:

     - Grade is 10 if all three conditions are met
     - Grade is 9 if conditions (i) and (ii) are met
     - Grade is 8 if conditions (ii) and (iii) are met
     - Grade is 7 if conditions (i) and (iii) are met
     - Grade is 6 if only one condition is met
     - Grade is 5 if none of the conditions are met

     Write a program, which will require the user to give values of
     hardness, carbon content and tensile strength of the steel under
     consideration and output the grade of the steel*/
    public static void task33() {
        System.out.println("Input hardness: ");
        double hardness = scanner.nextDouble();
        System.out.println("Input carbon content: ");
        double carbon = scanner.nextDouble();
        System.out.println("Input tensile strength: ");
        double tensile = scanner.nextDouble();
        boolean isHardness = hardness > 50;
        boolean isCarbon = carbon < 0.7;
        boolean isTensile = tensile > 5600;
        if (isHardness){
            if (isTensile && isCarbon)
                System.out.println("Grade is 10");
            else if (isCarbon)
                System.out.println("Grade is 9");
            else if (isTensile)
                System.out.println("Grade is 7");
            else
                System.out.println("Grade is 6");
        } else if (isTensile){
            if (isCarbon){
                System.out.println("Grade is 8");
            } else
                System.out.println("Grade is 6");
        } else if (isCarbon)
            System.out.println("Grade is 6");
        else
            System.out.println("Grade is 5");
    }

    /*34. A library charges a fine for every book returned late. For
first 5 days the fine is 50 paise, for 6-10 days fine is one rupee and
above 10 days fine is 5 rupees. If you return the book after 30 days
your membership will be cancelled. Write a program to accept the number
of days the member is late to return the book and display the fine or
the appropriate message*/
    public static void task34() {
        System.out.println("Input days:");
        int input = scanner.nextInt();
        double res = 0;
        if (input > 30) {
            System.out.println("membership is canceled");
            input = 30;
        }
        if (input > 10){
            res += (input - 10) * 5;
            input = 10;
        }
        if (input > 5){
            res += input - 5;
            input = 5;
        }
        res += input * 0.5;
        System.out.println("need to pay: " + res);

    }

    /*35. In a company, worker efficiency is determined on the basis of the time required for a worker to complete a particular job.
     If the  time taken by the worker is between 2 – 3 hours, then the worker is said to be highly efficient. If the time required by the worker is between 3 – 4 hours,
      then the worker is ordered to improve speed. If the time  taken is between 4 – 5 hours, the worker is given training to improve  his speed, and if the time taken by
       the worker is more than 5 hours, then the worker has to leave the company.
     If the time taken by the worker is input through the keyboard, find the efficiency of the worker*/
    public static void task35() {
        System.out.println("Input how much time is need to do job: ");
        int time = scanner.nextInt();
        if (time <= 3)
            System.out.println("The worker is highly efficient");
        else if (time <= 4)
            System.out.println("Worker should work faster");
        else if (time <= 5)
            System.out.println("Worker should learn how to work faster");
        else
            System.out.println("FIRE THIS WORKER!!!!!!!!");

    }

    /*36. Write a Java program that accepts three numbers and check All numbers are equal or not*/
    public static void task36() {
        System.out.println("Input your first number: ");
        int first = scanner.nextInt();
        System.out.println("Input your second number: ");
        int second = scanner.nextInt();
        System.out.println("Input your third number: ");
        int third = scanner.nextInt();
        if (first == second && second == third)
            System.out.println("Your numbers are equal!!!");
        else
            System.out.println("Your numbers are not equal");
    }

    /*37. Write a Java program that reads an positive integer and count the number of digits*/
    public static void task37() {
        System.out.println("Input your number: ");
        System.out.println("Your number has " + scanner.next().length() + " digits");
    }

    /*38. Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order*/
    public static void task38() {
        System.out.println("Input your first number: ");
        int first = scanner.nextInt();
        System.out.println("Input your second number: ");
        int second = scanner.nextInt();
        System.out.println("Input your third number: ");
        int third = scanner.nextInt();
        if (first > second && second > third)
            System.out.println("Your numbers entered in decreasing order");
        else if (first < second && second < third)
            System.out.println("Your numbers entered in increasing order");
        else
            System.out.println("Your numbers are nut ordered");
    }

    /*39. Write a Java program to check whether the given integer is a multiple of 5*/
    public static void task39() {
        System.out.println("Input your number: ");
        int a = scanner.nextInt();
        if (a % 5 == 0)
            System.out.println("Your number is multiple of 5");
        else
            System.out.println("Your number is not multiple of 5");
    }


}
