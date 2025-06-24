package com.logic.DSA.BinarySearch;
/*
Largest index such that the
number at the index must be less than or equal to the given number
 */
public class FindFloor {
    private static void findFloor(int[] arr,int target){
        int low = -0;
        int high = arr.length;
        int mid = -1;
        int ans =0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]<=target) {
                low = mid + 1;
                ans = mid;
            }
            else
                high = mid-1;
        }
        System.out.println("The floor value is "+arr[ans]+" at the index : "+ans);
    }

    public static void main(String[] args) {
        int[] arr = {11,14,16,18,22,26,26,26,29,30,33,35,40,46};
        int target = 26;

        findFloor(arr,target);
    }
}
