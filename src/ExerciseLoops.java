package src;

import java.util.Arrays;

public class ExerciseLoops {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,10}, {4, 5, 6,10}, {7, 8, 9,10}};
        //findLowestColumnProd(arr);
        int[] att = {1, 2, 3, 4, 4, 4, 5, 6, 7, 8};
        //findBorders(att, 9);
        //printMatrixAngles(arr);
        int[][] ints = transponMatrix(arr);
        System.out.println("-----------------");
        for (int i = 0; i < ints.length; i++) {
            for (int i1 = 0; i1 < ints[i].length; i1++) {
                System.out.print(ints[i][i1] + " ");
            }
            System.out.println();
        }



    }

    public static void printReversePyramid() {
        for (int i = 0; i < 5; i++) {
            String tmp = "";
            char a = 'A';
            for (int j = 0; j < 9 - 2 * i; j++) {
                tmp += a++;
            }
            for (int j = i; j < 2 * i; j++) {
                tmp = " " + tmp;
            }
            System.out.println(tmp);
        }
    }

    public static void printNumberPattern() {
        int num = 1;
        for (int i = 0; i < 5; i++) {
            String tmp = "";
            for (int j = 0; j <= i; j++) {
                tmp += num++ + " ";
            }
            System.out.println(tmp);
        }
    }

    public static void printPyramid() {
        char a = 'A';
        for (int i = 0; i < 5; i++) {
            String tmp = "";
            for (int j = 0; j < 5 - i; j++) {
                tmp += " ";
            }
            for (int j = 0; j <= i; j++) {
                tmp += a + " ";
                a++;
            }
            System.out.println(tmp);
        }
    }

    /*Matrix13. Дана квадратная матрица A порядка M. Начиная с элемента A[1,1], вы вести ее элементы
    следующим образом («уголками»): все элементы первой строки; элементы последнего столбца, кроме первого
     (уже выведенного) элемента; оставшиеся элементы второй строки; оставшиеся элементы
предпоследнего столбца и т. д.; последним выводится элемент A[M,1]*/

    public static void printMatrixAngles(int[][] array) {
        int arraySize = array.length;
        int rightIndex = array.length - 1;
        for (int i = 0; i < arraySize; i++) {
            for (int i1 = 0; i1 < rightIndex + 1; i1++) {
                System.out.print(array[i][i1] + " ");
            }
            for (int i1 = i + 1; i1 < arraySize; i1++) {
                System.out.print(array[i1][rightIndex] + " ");
            }
            rightIndex--;
            System.out.println();
        }
    }

    /*Matrix26. Дана матрица размера M × N. Найти номер ее столбца
     с наимень шим произведением элементов и вывести данный номер, а также значение
наименьшего произведения*/
    public static void findLowestColumnProd(int[][] array) {
        int minProd = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < array.length; i++) {
            int prod = 1;
            for (int i1 = 0; i1 < array.length; i1++) {
                prod *= array[i1][i];
            }
            if (minProd > prod) {
                minProd = prod;
                minIdx = i;
            }
        }
        System.out.println("Minimal production column = " + minProd);
        System.out.println("Minimal production column id : " + minIdx);
    }

    /*Есть одномерный массив размера N. Вам нужно найти начальную и конечную позиции
    числа К. Если числа К нет в массиве то вывести [-1;-1]*/

    public static void findBorders(int[] array, int k) {
        int firstIndex = Integer.MAX_VALUE;
        int lastIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]) {
                firstIndex = Math.min(firstIndex, i);
                lastIndex = Math.max(lastIndex, i);
            }
        }
        if (lastIndex == -1)
            System.out.println("[-1,-1]");
        else
            System.out.println("[" + firstIndex + ", " + lastIndex + "]");
    }

    /*Транспонированная матрица*/
    public static int[][] transponMatrix(int[][] array){
        int[][] res = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                res[i1][i] = array[i][i1];
            }
        }
        return res;
    }

}
