package src.randomTask;

import java.util.Arrays;

public class task1 {
    int t;

    public static void main(String[] args) {
        int[] ints = {1, 2, 1, 1, 2 ,4 ,2};
        System.out.println(getThirdMax(ints));
        task1 task1;
    }



    /*
    Возвращать третье максимальное число в массиве nums. Если третьего максимума не существует, верните максимальное число.

Пример 1:
Входные данные: nums = [1, 2, 3, 4]
Выходные данные: 2

Пример 2:
Входные данные: nums = [1,2]
Выходные данные: 2
     */
    public static int getThirdMax(int[] array){
        Arrays.sort(array);
        int counter = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != array[i - 1]){
                counter++;
            }
            if (counter == 3){
                return array[i];
            }
        }
        return array[0];
    }
}
