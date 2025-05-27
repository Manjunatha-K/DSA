package com.logic.DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    private static void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        else {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            mergSort(arr, low, mid, high);
        }

    }

    private static void mergSort(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] resultArray = new int[high + 1];
        int count = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                resultArray[count] = arr[left];
                count++;
                left++;
            } else {
                resultArray[count] = arr[right];
                count++;
                right++;
            }
        }

        while (left <= mid) {
            resultArray[count] = arr[left];
            count++;
            left++;
        }

        while (right <= high) {
            resultArray[count] = arr[right];
            count++;
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = resultArray[i - low];
        }

    }

    public static void main(String args[]) {
        int[] arr = {5, 3, 6, 2, 7, 1, 8, 0, 2, 7, 9, 10, -1};
        int high = arr.length - 1;
        int low = 0;
        sort(arr, low, high);


        System.out.println("ARRAY AFTER SORTING : MERGE SORT");
        for (int i = low; i <= high; i++) {
            System.out.println(arr[i]);
        }
    }

}
