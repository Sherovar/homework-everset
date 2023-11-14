package src;

import java.util.Scanner;

public class Exercise4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    /*
    ### Task 1: Name of the week

    Description: An integer in the range 1-7 is given. Output a string — the name of the dayof the week corresponding to this number (1 — "Monday", 2 — "Tuesday", etc.)

    Описание: Дано целое число в диапазоне 1–7. Вывести строку — название днянедели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.)
*/
    public static void task1() {
        int a = scanner.nextInt();

        switch (a) {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 7 -> System.out.println("SUNDAY");
        }

    }

    /*
    ### Task 2: Description of the assessment

        Description: Given an integer K. Output a string describing the score corresponding to the number K (1 — "bad", 2 — "unsatisfactory", 3 — "satisfactory", 4 — "good", 5 — "excellent"). If K does not lie in the range 1-5, then print the line "error".

        Описание: Дано целое число K. Вывести строку-описание оценки, соответствующей числу K:

                1 — «плохо»,

                2 — «неудовлетворительно»,

                3 — «удовлетворительно»,

                4 — «хорошо»,

                5 — «отлично»

        Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».
    */
    public static void task2() {
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> System.out.println("bad");
            case 2 -> System.out.println("unsatisfactory");
            case 3 -> System.out.println("satisfactory");
            case 4 -> System.out.println("good");
            case 5 -> System.out.println("excellent");
            default -> System.out.println("ERROR");
        }
    }

    /*
                ### Task 3: Name of the month and season

        Description: The month number is given — an integer in the range 1-12 (1 — January, 2 —February, etc.).
         Print the name of the corresponding time of year ("winter","spring", "summer", "autumn").

        Описание: Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — фе-враль и т. д.).
         Вывести название соответствующего времени года («зима»,«весна», «лето», «осень»).

    */
    public static void task3() {
        int a = scanner.nextInt();
        switch (a) {
            case 1, 12, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("spring");
            case 6, 7, 8 -> System.out.println("summer");
            case 9, 10, 11 -> System.out.println("autumn");
            default -> System.out.println("Out of month number");
        }
    }

    /*            ### Task 4: Arithmetic operations

        Description: Arithmetic operations on numbers are numberedas follows: 1 — addition, 2 — subtraction,
        3 — multiplication, 4 — division. Theaction number N is given (an integer in the range 1-4) and the real
         numbers Aand B (B is not equal to 0). Perform the specified action on the numbers and outputthe result.

        Описание: Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание,
        3 — умножение, 4 — деление. Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа Aи
         B (В не равно 0). Выполнить над числами указанное действие и вывести результат.

     */
    public static void task4() {
        System.out.println("Enter number one: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number two: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number of operation(1 — addition, 2 — subtraction,\n" +
                "    3 — multiplication, 4 — division): ");
        int c = scanner.nextInt();
        switch (c) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            default -> System.out.println("ERROR");
        }
    }

    /*           ### Task 5: Name of the month and season

    Description: The month number is given — an integer in the range
     1-12 (1 — January, 2 —February, etc.). Print the name of the corresponding time of year ("winter","spring", "summer", "autumn").

    Описание: Единицы длины пронумерованы следующим образом: 1 — дециметр,2 — километр,
     3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номерединицы длины (целое число в диапазоне 1–5) и
      длина отрезка в этихединицах (вещественное число). Найти длину отрезка в метрах..

*/
    public static void task5() {
        System.out.println("1 — дециметр,2 — километр,\n" +
                "     3 — метр, 4 — миллиметр, 5 — сантиметр");
        int a = scanner.nextInt();
        System.out.println("Введите количество");
        double b = scanner.nextDouble();
        switch (a) {
            case 1 -> System.out.println((b * 0.1) + "метров");
            case 2 -> System.out.println((b * 1000) + "метров");
            case 3 -> System.out.println((b * 1) + "метров");
            case 4 -> System.out.println((b * 0.001) + "метров");
            case 5 -> System.out.println((b * 0.01) + "метров");
            default -> System.out.println("НЕТ ТАКОЙ ВЕЛИЧИНЫ");
        }
    }

    /*
        ### Task 6: Calculate the weight in kilograms.

                Description: The units of mass are numbered as follows: 1 — kilogram, 2 — milligram, 3 — gram, 4 — ton, 5 — hundredweight.
                The number of the mass unit is given (an integer in the range 1-5) and the body mass in these units (a real number).
                 Find the body weight in kilograms.

        Описание: Единицы массы пронумерованы следующим образом: 1 — килограмм,2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер.
        Дан номер единицы массы (целое число в диапазоне 1–5) и масса тела в этих единицах (вещественное число). Найти массу тела в килограммах.
    */
    public static void task6() {
        System.out.println("1 — килограмм,2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер");
        int a = scanner.nextInt();
        System.out.println("Введите количество");
        double b = scanner.nextDouble();
        switch (a) {
            case 1 -> System.out.println((b * 1) + "килограмм");
            case 2 -> System.out.println((b * 0.000001) + "килограмм");
            case 3 -> System.out.println((b * 0.001) + "килограмм");
            case 4 -> System.out.println((b * 1000) + "килограмм");
            case 5 -> System.out.println((b * 100) + "килограмм");
            default -> System.out.println("НЕТ ТАКОЙ ВЕЛИЧИНЫ");
        }
    }

    /*
### Task 7: Direction of the robot

    Description: The robot can move in four directions ("C" — north, "Z" — west, "Y" — south, "B" — east)
     and receive three digital commands: 0 — continue moving, 1 — turn left, -1 — turn right.

    The symbol C is the initial direction of the robot and the integer N is the command sent to it.
    Output the direction of the robot after executing the received command.

            Описание: Робот может перемещаться в четырех направлениях («С» — север,«З» — запад, «Ю» — юг, «В» — восток)
             и принимать три цифровые команды: 0 — продолжать движение, 1 — поворот налево, −1 — поворот направо.

    Дан символ C-исходное направление робота и целое число N-посланная ему команда. Вывести направление робота после выполнения полученной команды.
*/
    public static void task7(){
        System.out.println("Input starting pos («С» — север,«З» — запад, «Ю» — юг, «В» — восток):");
        char c = scanner.next().charAt(0);
        System.out.println("Input move (0 — продолжать движение, 1 — поворот налево, −1 — поворот направо)");
        int a = scanner.nextInt();
        switch (a){
            case 0 -> System.out.println(c);
            case 1 -> {
                switch (c){
                    case 'С' -> System.out.println("З");
                    case 'З' -> System.out.println("Ю");
                    case 'Ю' -> System.out.println("В");
                    case 'В' -> System.out.println("С");
                }
            }
            case 2 -> {
                switch (c){
                    case 'С' -> System.out.println("В");
                    case 'З' -> System.out.println("С");
                    case 'Ю' -> System.out.println("З");
                    case 'В' -> System.out.println("Ю");
                }
            }
        }
    }

    /*
### Task 8: Identify the zodiac sign.

    Description: Two integers are given: D (day) and M (month), which determine thecorrect date.
     Print the zodiac sign corresponding to this date: "Aquarius" (20.1–18.2), "Pisces" (19.2–20.3),
      "Aries" (21.3–19.4), "Taurus" (20.4–20.5), "Gemini" (21.5–21.6), "Cancer" (22.6–22.7), "Leo" (23.7–22.8),
       "De-va" (23.8–22.9), "Libra" (23.9–22.10), "Scorpio" (23.10–22.11), "Strelet"(23.11–21.12), "Capricorn" (22.12–19.1).

    Описание: Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. Вывести знак Зодиака,
     соответствующий этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5),
      «Близнецы» (21.5–21.6), «Рак» (22.6–22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10),
       «Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1)
*/
    public static void task8(){
        System.out.println("Input day and month:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        switch (month){
            case 1 -> {
                if (day <= 19)
                    System.out.println("Козерог");
                else
                    System.out.println("Водолей");
            }
            case 2 -> {
                if (day <= 19)
                    System.out.println("Водолей");
                else
                    System.out.println("Рыбы");
            }
            case 3 -> {
                if (day <= 20)
                    System.out.println("Рыбы");
                else
                    System.out.println("Овен");
            }
            case 4 -> {
                if (day >= 19)
                    System.out.println("Овен");
                else
                    System.out.println("Телец");
            }
            case 5 -> {
                if (day <= 20)
                    System.out.println("Телец");
                else
                    System.out.println("Близнецы");
            }
            case 6 -> {
                if (day <= 21)
                    System.out.println("Близнецы");
                else
                    System.out.println("Рак");
            }
            case 7 -> {
                if (day <= 22)
                    System.out.println("Рак");
                else
                    System.out.println("Лев");
            }
            case 8 -> {
                if (day <= 22)
                    System.out.println("Лев");
                else
                    System.out.println("Дева");
            }
            case 9 -> {
                if (day <= 22)
                    System.out.println("Дева");
                else
                    System.out.println("Весы");
            }
            case 10 -> {
                if (day <= 22)
                    System.out.println("Весы");
                else
                    System.out.println("Скорпион");
            }
            case 11 -> {
                if (day <= 2)
                    System.out.println("Скорпион");
                else
                    System.out.println("Стрелец");
            }
            case 12 -> {
                if (day <= 21)
                    System.out.println("Стрелец");
                else
                    System.out.println("Козерог");
            }

        }
    }

    /*
                ### Task 9: Print a string describing the age.

        Description: An integer in the range of 20-69 is given, which determines the age
         (in years).Print a string describing the specified age, ensuring the correct combination
         of the number with the word "year", for example: 20 - "twenty years", 32 -"thirty—two years", 41 — "forty-one years".

        Описание: Дано целое число в диапазоне 20–69, определяющее возраст (в годах).Вывести
        строку-описание указанного возраста, обеспечив правильное согласование числа со словом «год»,
        например: 20 — «двадцать лет», 32 —«тридцать два года», 41 — «сорок один год».

    */
    public static void task9() {
        System.out.println("Input age:");
        int age = scanner.nextInt();
        int tens = age / 10;
        int digits = age % 10;
        String tensString = "";
        String digitsString = "";
        switch (tens) {
            case 2 -> tensString = "двадцать";
            case 3 -> tensString = "тридцать";
            case 4 -> tensString = "сорок";
            case 5 -> tensString = "пятьдесят";
            case 6 -> tensString = "шестьдесят";
        }
        switch (digits) {
            case 1 -> digitsString = "один";
            case 2 -> digitsString = "два";
            case 3 -> digitsString = "три";
            case 4 -> digitsString = "четыре";
            case 5 -> digitsString = "пять";
            case 6 -> digitsString = "шесть";
            case 7 -> digitsString = "семь";
            case 8 -> digitsString = "восемь";
            case 9 -> digitsString = "девять";
        }
        if (digits < 5)
            System.out.println(tensString + digitsString + " год");
        else
            System.out.println(tensString + digitsString + " лет");
    }

    /*
                ### Task 10: Print a string describing the number.

        Description: An integer in the range 100-999 is given. Output a string describingthis number,
         for example: 256 — "two hundred and fifty—six", 814 - "seven hundred and fourteen".

        Описание: Дано целое число в диапазоне 100–999. Вывести строку-описание данного числа, например:
        256 — «двести пятьдесят шесть», 814 — «во-семьсот четырнадцать».
    */
    public static void task10() {
        System.out.println("Input number:");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int digits = number % 10;
        String tensString = "";
        String hundredsString = "";
        String digitsString = "";
        switch (hundreds) {
            case 1 -> hundredsString = "сто";
            case 2 -> hundredsString = "двести";
            case 3 -> hundredsString = "триста";
            case 4 -> hundredsString = "четыреста";
            case 5 -> hundredsString = "пятьсот";
            case 6 -> hundredsString = "шестьсот";
            case 7 -> hundredsString = "семьсот";
            case 8 -> hundredsString = "восемьсот";
            case 9 -> hundredsString = "девятьсот";
        }
        if (tens != 1) {
            switch (tens) {
                case 2 -> tensString = "двадцать";
                case 3 -> tensString = "тридцать";
                case 4 -> tensString = "сорок";
                case 5 -> tensString = "пятьдесят";
                case 6 -> tensString = "шестьдесят";
                case 7 -> tensString = "семьдесят";
                case 8 -> tensString = "восемьдесят";
                case 9 -> tensString = "девяносто";
            }
            switch (digits) {
                case 1 -> digitsString = "один";
                case 2 -> digitsString = "два";
                case 3 -> digitsString = "три";
                case 4 -> digitsString = "четыре";
                case 5 -> digitsString = "пять";
                case 6 -> digitsString = "шесть";
                case 7 -> digitsString = "семь";
                case 8 -> digitsString = "восемь";
                case 9 -> digitsString = "девять";
            }
        } else {
            switch (digits){
                case 1 -> tensString = "одиннадцать";
                case 2 -> tensString = "двенадцать";
                case 3 -> tensString = "тринадцать";
                case 4 -> tensString = "четырнадцать";
                case 5 -> tensString = "пятнадцать";
                case 6 -> tensString = "шестнадцать";
                case 7 -> tensString = "семнадцать";
                case 8 -> tensString = "восемнадцать";
                case 9 -> tensString = "девятнадцать";
            }
        }
        System.out.println(hundredsString + " " + tensString + " " + digitsString);



    }

}
