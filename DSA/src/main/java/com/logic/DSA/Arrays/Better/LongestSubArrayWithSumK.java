package com.logic.DSA.Arrays.Better;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    private static void findLongest(int[] arr,int k){
        Map<Integer, Integer> preSum = new HashMap<>();
        int sum =0;
        int maxLen = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == k)
                maxLen = Math.max(i+1,maxLen);
            int remaining = k - sum;
             if(preSum.containsValue(remaining)){
                int len = i - preSum.getOrDefault(remaining, -1);
                 maxLen = Math.max(len,maxLen);
            }
            preSum.put(remaining,i);
        }
        System.out.println("MAXIMUM SUBARRAY SUM IS : "+ maxLen);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,2,6,7,8,9,0,1,2,3};
        int k = 10;
        findLongest(arr,k);
    }
}
