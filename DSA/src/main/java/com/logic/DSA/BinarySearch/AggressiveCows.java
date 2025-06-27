package com.logic.DSA.BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    private static void findMaxOfMinDistanceBtwCows(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println("After sorting");
        Arrays.stream(arr).forEach(System.out::println);
        int high = Arrays.stream(arr).max().getAsInt() - arr[0];
        int low = 0;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(canWePlace(arr,mid,k)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println("Maximum Distance between the cows is : "+high);
    }

    private static boolean canWePlace(int[] arr, int mid, int k) {
        int countOfCows = 1;
        int previousCowPosition = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i] - previousCowPosition >=mid){
                countOfCows++;
                previousCowPosition = arr[i];
            }
        }
        if(countOfCows >= k)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,4,7,10,9};
        int k = 4;
        findMaxOfMinDistanceBtwCows(arr,k);
    }


}
