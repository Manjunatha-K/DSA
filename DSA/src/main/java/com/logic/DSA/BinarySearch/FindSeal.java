package com.logic.DSA.BinarySearch;
/*
Largest index such that the
number at the index must be less than the given number
 */
public class FindSeal {
    private static void findSeal(int[] arr, int target){
        int low =0;
        int high = arr.length;
        int mid = -1;
        int ans = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]<target){
                ans = mid;
                low = mid+1;
            }else
                high = mid-1;
        }
        System.out.println("The Seal value is : "+arr[ans]+" At the index : "+ans);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        findSeal(arr, target);
    }
}
