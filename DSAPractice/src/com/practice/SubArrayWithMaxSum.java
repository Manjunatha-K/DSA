package com.practice;

import java.util.Map;

public class SubArrayWithMaxSum {

    private static void findMaxSumOptimal(int[] arr) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("MaxSum using optimal is : " + maxSum);
    }

    private static void findMaxSumBetter(int[] arr) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println("Maximum sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        findMaxSumBetter(arr);
        findMaxSumOptimal(arr);
    }


}
