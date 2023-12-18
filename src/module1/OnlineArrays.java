package src.module1;

public class OnlineArrays {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        //int[][] array = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        //int[][] array = {{1, 1, 1}, {2, 2, 2}, {1, 4, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                System.out.print(array[i][i1] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        everyDiagSum(array);

    }

    /*Дана квадратная матрица A порядка M. Найти сумму
элементов, стоящих на главной диагонали и ниже е.*/
    public static int diagSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                if (i >= i1)
                    sum += array[i][i1];
            }
        }
        return sum;
    }


    /*Дана квадратная матрица A порядка M. Найти сумму
элементов каждой ее диагонали, параллельной главной (начиная с одно элементной диагонали A1,M).*/
    public static void everyDiagSum(int[][] array){
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            int idx = array.length - i - 1;
            for (int i1 = 0; i1 <= i; i1++) {
                rightSum += array[i1][idx];
                leftSum += array[idx][i1];
                idx++;
            }
            if (i == array.length -1){
                System.out.println(leftSum);
                return;
            }
            System.out.println(leftSum);
            System.out.println(rightSum);
        }


    }
}
