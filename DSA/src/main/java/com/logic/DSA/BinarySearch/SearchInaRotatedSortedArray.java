package com.logic.DSA.BinarySearch;

public class SearchInaRotatedSortedArray {

    private static void searchBS(int[] arr, int num) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid] == num){
                System.out.println("THE ELEMENT IS PRESENT");
                return;
            }
            if(arr[low]<arr[mid]){
                if(arr[low]<=num && num<=arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }else{
                if(arr[mid]<=num && num<=arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        System.out.println("THE ELEMENT IS NOT PRESENT");
    }

    public static void main(String[] args) {
        int[] arr ={8,9,0,1,2,3,4,5,6,7};
        int num = 0;
        searchBS(arr, num);
    }


}
