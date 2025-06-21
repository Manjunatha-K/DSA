package com.logic.DSA.Arrays.Optimal;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,7,2,6,3,8,4,5,9,0};
        int target = 10;
        Arrays.sort(arr);
        int i =0;
        int n = arr.length-1;
        while(i<n){
            if(arr[i]+arr[n] ==target) {
                System.out.println("THE TWO SUM IS : " + arr[i] + "--" + arr[n]);
                return;
            }
            else if(arr[i]+arr[n] >target)
                n--;
            else
                i++;
        }

        System.out.println("NO TWO SUM");

    }
}
