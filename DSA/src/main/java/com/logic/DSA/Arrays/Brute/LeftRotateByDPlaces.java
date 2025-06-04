package com.logic.DSA.Arrays.Brute;

public class LeftRotateByDPlaces {
    private static void leftRotateByDPlaces(int[] arr, int d) {
       int n = arr.length;
       d = d%n;
       int temp[] = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[d+i] = temp[i];
        }

        System.out.println("ARRAY AFTER LEFT ROTATING");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 67, 8, 6, 4, 9, 0, 1, 3, 6, 27, 8, 9};
        int d = 17;
        leftRotateByDPlaces(arr,d);
    }


}
