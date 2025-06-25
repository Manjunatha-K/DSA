package com.logic.DSA.BinarySearch;

public class FindPeakElement {
    private static void findPeakElement(int[] arr) {
        int low = 1;
        int high = arr.length-2;
        int mid = -1;
        int peak = Integer.MIN_VALUE;
        if(arr[0] > arr[1])
            peak = arr[0];
        if(arr[arr.length-1]>arr[arr.length-2])
            peak = arr[arr.length-1];
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                peak = arr[mid];
            if(arr[low]<=arr[mid]){
                peak = Math.max(peak,arr[mid]);
                low = mid+1;
            }else{
                peak = Math.max(peak,arr[low]);
                high = mid-1;
            }
        }
        System.out.println("PEAK ELEMENT IS : "+ peak);
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,11,12,13,14,15,17,17,18,1,2,3,4,5,5,6};
        findPeakElement(arr);
    }


}
