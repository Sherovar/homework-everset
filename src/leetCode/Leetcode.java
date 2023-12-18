package src.leetCode;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {



    }

    /*https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.*/
    public static void rotate(int[] nums, int k) {
        int pos = k;
        int tmpArr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (pos >= nums.length) {
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

    /*https://leetcode.com/problems/plus-one/
    * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.*/
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] ints = new int[digits.length + 1];
            ints[0] = 1;
            return ints;
        }
        return digits;

    }

    /*https://leetcode.com/problems/add-binary/description/
    * Given two binary strings a and b, return their sum as a binary string.*/
    public static String addBinary(String a, String b) {
        String res = "";
        int tmp = 0;
        int posA = a.length() - 1;
        int posB = b.length() - 1;
        while (posA >= 0 || posB >= 0) {
            boolean isAOne = posA >= 0 && a.charAt(posA) == '1';
            boolean isBOne = posB >= 0 && b.charAt(posB) == '1';
            if (isAOne && isBOne) {
                if (tmp == 1) {
                    res = '1' + res;
                } else {
                    res = '0' + res;
                    tmp = 1;
                }
            } else if (isAOne || isBOne) {
                if (tmp == 1) {
                    res = '0' + res;
                } else {
                    res = '1' + res;
                    tmp = 0;
                }
            } else {
                if (tmp == 1) {
                    res = '1' + res;
                    tmp = 0;
                } else {
                    res = '0' + res;
                }
            }
            posA--;
            posB--;
        }
        if (tmp == 1){
            res = '1' + res;
        }

        return res;
    }

    /*https://leetcode.com/problems/climbing-stairs/description/
    * You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/
    public int climbStairs(int n) {
        int prev = 0;
        int prevPrev = 0;
        int curr = 1;
        for (int i = 0; i < n; i++) {
            prevPrev = prev;
            prev = curr;
            curr = prev + prevPrev;
        }
        return curr;
    }


}

