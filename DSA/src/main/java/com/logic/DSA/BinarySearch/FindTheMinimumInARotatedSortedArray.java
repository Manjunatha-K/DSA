package com.logic.DSA.BinarySearch;

public class FindTheMinimumInARotatedSortedArray {

    private static void findMinimum(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid = -1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[low] < arr[high]){
                 min = arr[low];
                 break;
            }
            if(arr[mid]>arr[high]){
                low = mid+1;
            }else{
                high  = mid-1;
            }

        }
        System.out.println("The MINIMUM IS : "+ min);
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,11,12,13,14,4,5};
        findMinimum(arr);
    }

}
