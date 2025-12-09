package com.logic.DSA.career.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6,7,2,3,7,8,0,1,2,3,65,4,0};

        for(int i =0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minIndex]> arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
