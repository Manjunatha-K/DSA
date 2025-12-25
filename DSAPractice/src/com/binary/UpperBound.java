package com.binary;

public class UpperBound {
    private static void upperBound(int[] arr, int target) {
        int low =0;
        int UpperBound = -1;
        int high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] > target) {
                UpperBound = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(UpperBound<0){
            System.out.println("No UpperBound");
        }else{
            System.out.println("UpperBound  is : "+UpperBound +" and the value is : " + arr[UpperBound]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,6,7,90,110,120,167,167,170,230};
        int target = 90;
        upperBound(arr,target);
    }
}
