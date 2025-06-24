package com.logic.DSA.BinarySearch;

public class FindTheFirstAndLastOccurance {


    private static int findFirstOccurance(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        int mid =-1;
        int ans = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]<target){
                low = mid+1;
            }else {
                ans = low;
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int findLastOccurance(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        int mid = -1;
        int ans = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]>target){
                high = mid-1;
            }else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,6,6,6,6,11,12,13,14};
        int target = 6;
        int firstOccurance = findFirstOccurance(arr, target);
        int lastOccurance = findLastOccurance(arr, target);
        System.out.println("First Occurance : "+firstOccurance+" ||| Last Occurance is : "+lastOccurance);
    }

}
