package src.module1;

public class Exercise5 {
    public static void main(String[] args) {
    }


    /*    ### Task 1: Find the smallest number.

        Description: Write a Java method to find the smallest number among three numbers.

                **Input:**

        Input the first number: 25

        Input the Second number: 37

        Input the third number: 29

                **Output:** The smallest value is 25.0

        Описание: Напишите Java-метод, чтобы найти наименьшее число среди трех чисел. **Ввод:**Введите первое число: 25

        Введите второе число: 37

        Введите третье число: 29

                **Вывод:** Наименьшее значение равно 25,0.
    */
    public static int task1(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /*
                ### Task 2: Find the average of numbers.

                Description: Write a Java method to compute the average of three numbers.**Input:**Input the first number: 25Input the second number: 45Input the third number: 65

                **Output:** The average value is 45.0

        Описание: Напишите Java-метод для вычисления среднего значения трех чисел.**Ввод:**Введите первое число: 25Введите второе число: 45Введите третье число: 65

                **Вывод:** Среднее значение составляет 45,0
    */
    public static double task2(int a, int b, int c) {
        return (a + b + c) / 3;
    }
/*

            ### Task 3: Display the middle character of a string.

            Description: Write a Java method to display the middle character of a string.Note: a) If the length of the string is odd there will be two middle characters. b) If the length of the string is even there will be one middle character.**Input**:Input a string: 350

            **Output**: The middle character in the string: 5

    Описание: Напишите Java-метод для отображения среднего символа строки.Примечание:
     а) Если длина строки нечетная, то в ней будут два средних символа.
     б) Если длина строки четная, то в ней будет один средний символ.**Ввод:**Введите строку: 350
            **Вывод**: Средний символ в строке: 5
*/
    public static String task3(String string){
        int middle = string.length()/2;
        return string.length() % 2 == 0 ? string.substring(middle-1, middle +1) : String.valueOf(string.charAt(middle));
    }


 /*           ### Task 4: Display the middle character of a string.

            Description: Write a Java method to display the middle character of a string.Note:
             a) If the length of the string is odd there will be two middle characters.
             b) If the length of the string is even there will be one middle character.**Input**:Input a string: 350

            **Output**: The middle character in the string: 5

    Описание: Напишите Java-метод для отображения среднего символа строки.

    Примечание: а) Если длина строки нечетная, то в ней будут два средних символа.
    б) Если длина строки четная, то в ней будет один средний символ.**Ввод:**Введите строку: 350

            **Вывод**: Средний символ в строке: 5
*/


}
