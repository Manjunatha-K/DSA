package com.logic.DSA.BinarySearch;

public class FindTheSingleElementInASortedArray {
    private static void findSingleElement(int[] arr){
        int low = 1;
        int high = arr.length-2;
        int mid = -1;
        if(arr[0] != arr[1]) {
            System.out.println("Single element is : " + arr[0]);
            return;
        }
        if(arr[arr.length-1] != arr[arr.length-2]) {
            System.out.println("Single Element is : " + arr[arr.length-1]);
            return;
        }
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) {
                System.out.println("Single Element is : " + arr[mid]);
                break;
            } else if((mid%2 == 0 && arr[mid] == arr[mid+1]) ||(mid%2 ==1 && arr[mid] == arr[mid-1]))
                low = mid+1;
            else
                high = mid-1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {-1,-1,0,0,1,1,2,2,3,4,4,5,5,6,6};
        findSingleElement(arr);
    }
}
