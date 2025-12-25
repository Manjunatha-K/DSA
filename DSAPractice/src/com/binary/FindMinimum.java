package com.binary;

public class FindMinimum {
    private static void findMinimum(int[] arr) {
        int low =0;
        int high = arr.length-1;
        int minimum = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
           if(arr[low]<arr[high]){
               minimum =Math.min( arr[low],minimum);
               break;
           }else if(arr[low]<arr[mid]){
               minimum =Math.min( arr[low],minimum);
               low = mid+1;
           }else{
               minimum =Math.min( arr[mid],minimum);
               high = mid-1;
           }
        }
        System.out.println("Minimum is : "+minimum);
    }
    public static void main(String[] args){
        int[] arr = {7,8,9,10,11,1,2,3,4,5,6};
        findMinimum(arr);
    }
}
