package com.logic.DSA.career.Sorting;

public class BubbleSort {
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3,6,6,7,7,8,6,5,2,0,2,4,7,99,1};

        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
