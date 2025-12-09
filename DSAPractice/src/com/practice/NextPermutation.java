package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    private static void findNextPermutation(int[] arr) {

        int index = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(Arrays.stream(arr).boxed().toList());
            return;
        }
        for (int i = arr.length - 1; i >= index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }
        reverse(arr,index+1);

        System.out.println("After finding the next permutation ");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void reverse(int[] arr, int index) {
        int right = arr.length-1;
        while(index<right){
            swap(arr,index,right);
            index++;
            right--;
        }
    }

    private static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        findNextPermutation(arr);
    }


}
