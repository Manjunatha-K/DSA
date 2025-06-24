package com.logic.DSA.Arrays.Better;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static void twoSumHashing(int[] arr, int target){
        Map<Integer, Integer> res = new HashMap<>();
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum  =arr[i];
            int rem = target - sum;
            if(res.containsKey(rem)){
                System.out.println("YES");
                return;
            }
            res.put(sum,i);
        }
        System.out.println("NO");

    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 6, 3, 8, 4, 5, 9, 0};
        int target = 17;
        twoSumHashing(arr,target);
    }
}
