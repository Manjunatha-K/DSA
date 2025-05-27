package com.logic.DSA.Sorting;

public class SelectionSort {
    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("THE ARRAY AFTER SORTING IS : SELECTION SORT");

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {5, 3, 6, 2, 7, 1, 8, 0, 2, 7, 9, 10, -1};

        sort(arr);
    }
}
