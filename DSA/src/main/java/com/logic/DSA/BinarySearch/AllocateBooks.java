package com.logic.DSA.BinarySearch;

import java.util.Arrays;

public class AllocateBooks {
    private static void findMaxPages(int[] arr, int k) {
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        while(low<=high){
           int mid = (low+high)/2;
           if(findNoOfStudents(arr,mid) > k){
               low = mid+1;
           }else{
               high = mid-1;
           }
        }
        System.out.println("The Minimum number of pages is : "+ low);
    }

    private static int findNoOfStudents(int[] arr, int mid) {
        int noOfStudents = 1;
        int studentPages = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] + studentPages <= mid){
                studentPages+=arr[i];
            }else {
                studentPages = arr[i];
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

    public static void main(String[] args) {
        int[] arr = {25,46,28,49,24};
        int k = 4;
        findMaxPages(arr,k);
    }


}
