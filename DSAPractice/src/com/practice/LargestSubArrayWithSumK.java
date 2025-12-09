package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumK {
    private static void findSumKUsingOpimal(int[] arr, int k) {
        Map<Integer, Integer> preSum = new HashMap<>();
        int sum = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                length = i + 1;
            }
            int remaining = sum - k;
            if (preSum.containsKey(remaining)) {
                int index = i - preSum.get(remaining);
                length = Math.max(length, index);
            }
            if (!preSum.containsKey(sum))
                preSum.put(sum, i);
        }
        System.out.println("SubArray with Max length using Optimal is : " + length);
    }

    private static void findSumKUsingBetter(int[] arr, int k) {
        int length = -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k)
                    length = Math.max(length, j - i + 1);
            }

        }
        System.out.println("Largest subArray using Better is : " + length);
    }

    private static void findSumKUsingBrute(int[] arr, int k) {
        int length = -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = 0;
                for (int l = i; l < j; l++) {
                    sum += arr[l];
                }
                if (sum == k)
                    length = Math.max(length, j - i);
            }
        }
        System.out.println("Largest subArray using Brute is : " + length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        findSumKUsingBrute(arr, k);
        findSumKUsingBetter(arr, k);
        findSumKUsingOpimal(arr, k);

    }


}
