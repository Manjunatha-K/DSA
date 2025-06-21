package com.logic.DSA.Arrays.Brute;

public class LongestSubArrayWithSumK {


    public static void main(String[] args){
        int[] arr = {1,2,1,4,2,6,7,8,9,0,1,2,3};
        int k = 10;
        findLongest(arr,k);
    }

    private static void findLongest(int[] arr, int k) {
        int longest =-1;
        int n = arr.length;
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j = i;j<n;j++){
                sum+=arr[j];
                if(sum == k){
                  longest = Math.max(longest,j-i+1);
                }
            }

        }
        System.out.println("LONGEST SUBARRAY WITH SUM : "+k+" IS : "+longest);
    }
}
