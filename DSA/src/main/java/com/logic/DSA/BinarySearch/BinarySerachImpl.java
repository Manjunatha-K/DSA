package com.logic.DSA.BinarySearch;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinarySerachImpl {
    private static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j =1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Array after sorting : ");
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }

    private static void BinarySearch(int[] arr, int target){

        int n = arr.length;
        int left = 0;
        int right = n;
        int mid;

        while(left<right){
            mid = (left+right)/2;
            if(arr[mid] == target){
                System.out.println("The Element is present:TRUE");
                return;
            }  else if(arr[mid]<target)
                left = mid+1;
            else
                right = mid-1;
        }
        System.out.println("NO ELEMENT IS PRESENT");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,0,1,2,5,7,8,90,0};
        int target= 8;
        BubbleSort(arr);
        System.out.println("Next Step ... Searching");
        BinarySearch(arr, target);

    }
}
