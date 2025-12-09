package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArray012 {

    private static void sortUsingOptimal(int[] arr) {
        int left =0; int mid =0;
        int high = arr.length-1;
        while(mid<high){
            if(arr[mid] == 0){
                swapping(arr,mid,left);
                mid++;
                left++;
            }else if(arr[mid] == 1)
                mid++;
            else{
                swapping(arr,mid,high);
                high--;
            }
        }
        System.out.println("After sorting using optimal");
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swapping(int[] arr, int mid, int left) {
        int temp = arr[mid];
        arr[mid] = arr[left];
        arr[left] = temp;
    }

    private static void sortUsingBetter(int[] arr) {
    }

    private static void sortUsingBrute(int[] arr) {
        List<Integer> zeros = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();

        for(int i =0;i<arr.length;i++){
            if(arr[i] ==0)
                zeros.add(arr[i]);
            else if(arr[i] == 1)
                ones.add(arr[i]);
            else
                twos.add(arr[i]);
        }

       int x =0;
        for (Integer zero : zeros) {
            arr[x] = zero;
            x++;
        }
        for (Integer one : ones) {
            arr[x] = one;
            x++;
        }
        for (Integer two : twos) {
            arr[x] = two;
            x++;
        }
        System.out.println("After sorting using brute : ");
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 0, 2, 2, 1, 1, 0, 0, 0, 2, 1, 2, 1, 0, 1, 1};
        sortUsingBrute(arr);
        sortUsingBetter(arr);
        sortUsingOptimal(arr);

    }
}
