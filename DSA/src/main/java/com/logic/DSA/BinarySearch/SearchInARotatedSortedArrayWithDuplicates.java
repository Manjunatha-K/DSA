package com.logic.DSA.BinarySearch;

public class SearchInARotatedSortedArrayWithDuplicates {

    private static void searchInDuplicates(int[] arr, int num) {
        int low = 0;
        int high = arr.length-1;
        int mid =-1;
        while(low<=high){

            mid = (low+high)/2;

            if(arr[mid] == num) {
                System.out.println("THE ELEMENT IS PRESENT");
                return;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low+1;
                high = high-1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<= num && num <=arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }else{
                if(arr[mid]<=num && num<=arr[high])
                    low = ++mid;
                else
                    high = --mid;
            }
        }
        System.out.println("ELEMENT IS NOT PRESENT");
        return;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,5,5,5,5,5,5,5,6,7,7,7,7,7,7,8,9,0,1,1,1,1,1,2,2,2,2,2,2,3};
        int num = 4;
        searchInDuplicates(arr, num);
    }


}
