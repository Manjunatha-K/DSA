package com.logic.DSA.BinarySearch;

public class SearchInsertPosition {
    private static void findInsertPosition(int[] arr, int num){
        int low =0;
        int high = arr.length;
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]<num){
                low = mid+1;
            }
            else
                high = mid-1;
        }
        System.out.println("INSERT POSITION IS : "+ low);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,11};
        int num = 10;
        findInsertPosition(arr,num);
    }
}
