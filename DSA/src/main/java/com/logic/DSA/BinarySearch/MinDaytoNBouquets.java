package com.logic.DSA.BinarySearch;

import java.util.Arrays;

/*
You are given an integer array bloomDay, an integer m and an integer k.

You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i]
and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be able to make m
bouquets from the garden. If it is impossible to make m bouquets return -1.
 */
public class MinDaytoNBouquets {
    private static void makeBouquets(int[] arr, int k, int m){
        int high = Arrays.stream(arr).max().getAsInt();
        int low = Arrays.stream(arr).min().getAsInt();
        int mid = -1;
        int inter = -1;
        int ans = -1;
        while(low<=high){
            mid = (low+high)/2;
             inter = findNumberOfBouquetes(arr, mid, m, k);
             if(inter == 0){
                ans = mid;
                high = mid-1;
             }else
                 low = mid+1;
        }
        System.out.println("Minimum Number of day to make "+m+" bouquetes is : "+ans);
    }

    private static int findNumberOfBouquetes(int[] arr, int mid, int m, int k) {
        int count =0;
        int noofB =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<= mid){
                count++;
            }else{
                noofB +=count/k;
                count = 0;
            }
        }
        noofB+=count/k;
        if(noofB >= m){
            return 0;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        if(m*k > arr.length) {
            System.out.println("-1");
            System.exit(-1);
        }
        makeBouquets(arr,k,m);
    }
}
