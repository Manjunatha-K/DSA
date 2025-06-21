package com.logic.DSA.Arrays.Optimal;

public class MaximumSubArraySum {
    private static void maximumSum(int[] arr){
        int sum =0;
        int maxSum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum =0;
            }
        }
        System.out.println("MAXIMUM SUB ARRAY SUM IS : "+ sum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-10,2,10,11};
        maximumSum(arr);

    }
}
