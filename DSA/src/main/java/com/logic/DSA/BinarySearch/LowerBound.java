package com.logic.DSA.BinarySearch;


/*
Smallest index such that the number at that index
is greater or equal to the given number
 */
public class LowerBound {
    private static void lowerBoundimpl(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]>=target)
                high = mid-1;
            else
                low = mid+1;
        }
        System.out.println("The smallest index is : "+mid +" and the number is : "+arr[mid]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,11,15,17,19,22,22,22,22,28,29,40};
        int target = 20;
        lowerBoundimpl(arr,target);
    }
}
