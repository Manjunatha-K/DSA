package com.logic.DSA.Arrays.Optimal;

public class LongestSubArrayWithSumK {

    private static void findLongest(int[] arr, int k){
        int left =0;
        int right =0;
        int n = arr.length;
        int sum = arr[0];
        int maxLen = -1;
        while(right<n){
            right++;
            while(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum == k)
                maxLen = Math.max(maxLen,right-left);
            if(right<n)
                sum+=arr[right];

        }
        System.out.println(maxLen);

    }
    public static void main(String[] args){
        int[] arr = {1,2,1,4,2,6,7,8,9,0,1,2,3};
        int k = 10;
        findLongest(arr,k);
    }
}
