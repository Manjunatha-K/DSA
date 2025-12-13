package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {

    private static void mergeSort(int[] arr,int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr,low,mid,high);


    }

    private static void merge(int[] arr, int low, int mid,int high) {
        List<Integer> result = new ArrayList<>();
        int left =low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                result.add(arr[left]);
                left++;
            }else{
                result.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            result.add(arr[left]);
            left++;
        }
        while(right<=high){
            result.add(arr[right]);
            right++;
        }
        for(int i =low;i<=high;i++)
            arr[i] = result.get(i-low);

    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("Bubble Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);


    }

    private static void insertionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
        System.out.println("Insertion Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.println("Selection Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] selectionArr = {1, 2, 5, 4, 3, 7, 8, 6, -5, -10, 4, 21, 3, 4, 6, 7};
        int[] insertionArr = {1, 2, 5, 4, 3, 7, 8, -6, 5, -10, 4, 21, 3, 4, 6, 7};
        int[] bubbleArr = {1, 2, 5, 4, 3, 7, -8, 6, 5, -10, 4, 21, 3, 4, 6, 7};
        int[] mergeArr = {1, 2, 5, 4, 3, 7, 8, 6, -5, -10, 4, 21, -3, -4, 6, 7};
        selectionSort(selectionArr);
        insertionSort(insertionArr);
        bubbleSort(bubbleArr);
        mergeSort(mergeArr, 0, mergeArr.length-1);
        System.out.println("Merge Sort");
        for (int i = 0; i < mergeArr.length; i++)
            System.out.println(mergeArr[i]);
    }

}
