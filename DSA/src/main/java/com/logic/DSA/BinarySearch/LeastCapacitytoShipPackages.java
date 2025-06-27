package com.logic.DSA.BinarySearch;

import java.util.Arrays;

/*
Problem Statement: You are the owner of a Shipment company.
You use conveyor belts to ship packages from one port to another.
The packages must be shipped within 'd' days.
The weights of the packages are given in an array 'of weights'.
The packages are loaded on the conveyor belts every day in the same order
as they appear in the array. The loaded weights must not exceed the
maximum weight capacity of the ship.
Find out the least-weight capacity so that you can ship all the packages within 'd' days.
 */
public class LeastCapacitytoShipPackages {
    private static void findListCapacity(int[] weights, int d){
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(findDays(weights,mid)<=d){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("The minumum capacity to ship packages in : "+d+" days is : "+low );
    }

    private static int findDays(int[] weights, int mid) {
        int day = 1;
        int load =0;
        for(int i =0;i<weights.length;i++){
            if(load+weights[i]>mid){
                day = day+1;
                load = weights[i];
            }else {
                load+=weights[i];
            }
        }
        return day;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7,8,9,10 };
        int d = 5;
        findListCapacity(weights,d);
    }
}
