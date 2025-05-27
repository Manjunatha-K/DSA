package com.logic.DSA.Sorting;

public class InsertionSort {
    private static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println("ARRAY AFTER SORTING : INSERTION SORT");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {5, 3, 6, 2, 7, 1, 8, 0, 2, 7, 9, 10, -1};

        sort(arr);
    }
}
