package src;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        printSquare();

    }

    /*Given an integer array nums, return true if any value appears
     at least twice in the array, and return false if every element is distinct.*/
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;

    }

    public static void prinSymbol() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= j)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

        /*Write an efficient algorithm that searches for a value target in an m x n integer
         matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.*/


    public static boolean searchMatrix(int[][] matrix, int target) {
        int idx = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][0]){
                idx = i;
                break;
        }
            if (idx == -1)
                return false;
            else
                for (int matrix1 : matrix[idx]) {
                    if (matrix1 == target)
                        return true;
                }
    }
        return false;

}
}
