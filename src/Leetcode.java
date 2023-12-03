package src;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);

    }


    /*https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.*/
    public static void rotate(int[] nums, int k) {
        int pos = k;
        int tmpArr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (pos >= nums.length){
                pos %= nums.length;
            }
            tmpArr[pos] = nums[i];
            pos++;
        }
        for (int i = 0; i < tmpArr.length; i++) {
            nums[i] = tmpArr[i];
        }

    }

    /*https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
    * You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
    public static int maxProfit(int[] prices) {
        int minId = 0;
        int minVal = 0;
        int maxId = 0;
        int maxVal = 0;

        return 1;
    }

}

