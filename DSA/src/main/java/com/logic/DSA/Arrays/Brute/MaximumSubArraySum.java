package com.logic.DSA.Arrays.Brute;

public class MaximumSubArraySum {
    private static void maxSum(int[] arr) {
        int n = arr.length;
        int maxSum =0;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<arr.length;j++){
                int sum =0;
                for(int k = i;k<j;k++){
                    sum+=arr[k];
                }
                maxSum = Math.max(maxSum,sum);
            }
        }
        System.out.println("MAXIMUM SUB ARRAY SUM IS : "+ maxSum);


    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 34, -67, 8, 6, 4, -9, 0, 1, 3, -6, -27, 8, 9};

        maxSum(arr);
    }


}
