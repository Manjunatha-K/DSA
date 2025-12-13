package com.binary;

public class FindFirstAndLastOccurance {
    private static int findLast(int[] arr, int target) {
        int low= 0;
        int last = -1;
        int high = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]== target){
                last = mid;
                low = mid+1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return last;
    }

    private static int findFirst(int[] arr, int target) {
        int low= 0;
        int first = -1;
        int high = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return first;
    }

    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,8,8,8,9,10};
        int target = 8;
        int first = findFirst(arr,target);
        int last = findLast(arr,target);

        System.out.println("First and last occurances is : "+first+" - "+last);
    }


}
