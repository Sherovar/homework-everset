package src;

public class Recursion {
    public static int count = 0;
    public static int[] fibArray = new int[20];
    public static void main(String[] args) {

        System.out.println(recur3_1(2,-1));


    }



/*
    **Recur1***. Описать рекурсивную функцию Fact(N) вещественного типа, вычисляющую значение факториала
    `N! = 1·2·...·N` (N > 0 — параметр целого типа).
    С помощью этой функции вычислить факториалы пяти данных чисел.
*/
    public static long recur1(int num){
        if (num == 1){
            return 1;
        }
        return recur1(num - 1) * num;
    }

/*
**Recur2.** Описать рекурсивную функцию Fact2(N) вещественного типа, вычисляющую значение двойного факториала
`N!! = N·(N−2)·(N−4)·...` (N > 0 — параметр целого типа; последний сомножитель в произведении равен 2, если
    N — четное число, и 1, если N — нечетное). С помощью этой функции вычислить двойные факториалы пяти данных чисел.
*/
    public static long recur2(int num){
        if (num % 2 == 1 || num == 0)
            return 1;
        return num * recur2(num - 2);
    }

/*
            **Recur3**. Описать рекурсивную функцию PowerN(X, N) вещественного типа,
    находящую значение N-й степени числа X по формулам:
    X^0 = 1, X^N = (X^N/2)^2 при четных N > 0,
    X^N = X·X^N−1 при нечетных N > 0,
    X^-N = 1/(X^N) при N < 0
            (X != 0 — вещественное число, N — целое; в формуле для четных N должна использоваться операция целочисленного деления).
    С помощью этой функции найти значения X^N для данного X при пяти данных значениях N.
*/

    public static double recur3(double num, int pow){
        if (pow == 0)
            return 1;
        return pow > 0 ? recur3(num, pow - 1) * num : 1 / recur3(num, pow);

    }

    public static double recur3_1(double num, int pow){
        if (pow == 0)
            return 1;
        if (pow < 0)
            return recur3_1(num, pow + 1) / num;
        if(pow % 2 == 0)
            return recur3_1(num, pow / 2) * recur3_1(num, pow / 2);
        else
            return recur3_1(num , pow - 1) * num;

    }

    public static double recur_s(double num, int pow) {
        if (pow == 0)
            return 1;
        if (pow < 0)
            return recur3_1(num, pow + 1) / num;
        if(pow % 2 == 0) {
            double result = recur_s(num, pow / 2);
            return result * result;
        }
        else
            return recur3_1(num , pow - 1) * num;
    }

/*
**Recur4**. Описать рекурсивную функцию Fib1(N) целого типа, вычисляющую N-й элемент последовательности чисел Фибоначчи
            (N — целое число):
    F[1] = F[2] = 1, F[K] = F[K−2] + F[K−1], K = 3, 4, ... .
    С помощью этой функции найти пять чисел Фибоначчи с данными номерами, и вывести эти числа вместе с количеством
    рекурсивных вызовов функции Fib1, потребовавшихся для их нахождения.
*/
    public static int recur4(int num){
        count++;
        if (num <= 2) {
            return 1;
        }

        return recur4(num - 2) + recur4(num - 1);
    }

/*
            **Recur5**. Описать рекурсивную функцию Fib2(N) целого типа, вычисляющую N-й элемент последовательности

    чисел Фибоначчи (N — целое число):
    F[1] = F[2] = 1, F[K] = F[K−2] + F[K−1], K = 3, 4, . . . .
    Считать, что номер N не превосходит 20. Для уменьшения количества рекурсивных вызовов по сравнению с функцией
    Fib1 (см. задание Recur4) создать вспомогательный массив для хранения уже вычисленных чисел Фибоначчи и обращаться к
    нему при выполнении функции Fib2. С помощью функции Fib2 найти пять чисел Фибоначчи с данными номерами
*/

    public static int recur5(int num){
        count++;
        if (num <=2){
            return 1;
        }
        if (0 != fibArray[num - 2])
            return fibArray[num - 2] + recur5(num - 2);
        return recur5(num - 2) + recur5(num - 1);
    }
}
