package src.leetCode;

import java.math.BigInteger;
import java.util.*;

public class Leetcode {
    public static void main(String[] args) {



    }




    public List<Integer> findSubstring(String s, String[] words) {
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String tmp = "";
            for (int i1 = 0; i1 < words.length; i1++) {
                tmp += words[i1];
            }
        }

        return null;
    }


/*
https://leetcode.com/problems/multiply-strings/description/
* Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.
* */
    public static String multiply(String num1, String num2) {
        BigInteger numInt1 = new BigInteger(String.valueOf(0));
        for (int i = 0; i < num1.length(); i++) {
            int tmpNum = num1.charAt(i) - 48;
            numInt1 = numInt1.multiply(BigInteger.valueOf(10));
            numInt1 = numInt1.add(BigInteger.valueOf(tmpNum));
        }
        BigInteger numInt2 = new BigInteger(String.valueOf(0));
        ;
        for (int i = 0; i < num2.length(); i++) {
            int tmpNum = num2.charAt(i) - 48;
            numInt2 = numInt2.multiply(BigInteger.valueOf(10));
            numInt2 = numInt2.add(BigInteger.valueOf(tmpNum));
        }
        return new BigInteger(String.valueOf(numInt1)).multiply(new BigInteger(String.valueOf(numInt2))).toString();
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
        if (tmp == 1) {
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

    public static String simplifyPath(String path) {
        String[] split = path.split("/");
        String res = "";
        for (String s : split) {
            if (!s.isEmpty()) {
                res += "/" + s;
            }
            if (s.contains(".")) {
                res = "";
            }
        }
        if (res.length() == 0)
            return "/";
        return res;

    }


}

