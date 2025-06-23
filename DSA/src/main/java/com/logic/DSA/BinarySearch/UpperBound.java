package com.logic.DSA.BinarySearch;
/*
Smallest index such that the number at the index must be greater than the given number
 */
public class UpperBound {
    private static void upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]<=target)
                low = mid+1;
            else
                high = mid-1;
        }
        System.out.println("THE UPPER BOUND IS AT INDEX : "+mid+" and the value is : "+ arr[mid]);
    }

    public static void main(String[] args) {
        int[] arr = {11,14,16,18,22,26,26,26,29,30,33,35,40,46};
        int target = 26;

        upperBound(arr,target);
    }
}
