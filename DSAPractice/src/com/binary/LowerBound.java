package com.binary;

public class LowerBound {
    private static void lowerBound(int[] arr, int target) {
        int low =0;
        int lowerBound = -1;
        int high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] >= target) {
                lowerBound = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(lowerBound<0){
            System.out.println("No lowerbound");
        }else{
            System.out.println("Lower bound is : "+lowerBound +"and the value is : " + arr[lowerBound]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,6,7,90,110,120,167,167,170,230};
        int target = 400;
        lowerBound(arr,target);
    }
}
