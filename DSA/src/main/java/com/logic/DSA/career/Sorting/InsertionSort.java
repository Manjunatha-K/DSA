package com.logic.DSA.career.Sorting;

public class InsertionSort {
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,7,9,0,5,0,2,1,4,6,8,7,4,-10,2,21};

        for(int i =0;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
