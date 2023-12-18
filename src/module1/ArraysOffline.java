package src.module1;


import java.util.ArrayList;
import java.util.Arrays;

public class ArraysOffline {

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        intersect(arr1,arr2);

        int a = 1;


    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> integers = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pos2 = 0;
        for (int j : nums1) {
            for (int i1 = pos2; i1 < nums2.length; i1++) {
                if (j == nums2[i1]) {
                    integers.add(j);
                    pos2 = i1 + 1;
                    break;
                }
            }
        }

        int[] tmp = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            tmp[i] = integers.get(i);
        }
        return tmp;
    }
}
