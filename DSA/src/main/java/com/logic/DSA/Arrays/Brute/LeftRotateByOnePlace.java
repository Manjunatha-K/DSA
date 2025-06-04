package com.logic.DSA.Arrays.Brute;

public class LeftRotateByOnePlace {

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 67, 8, 6, 4, 9, 0, 1, 3, 6, 27, 8, 9};
        leftRotateByOnePlace(arr);
    }

    private static void leftRotateByOnePlace(int[] arr) {
        int leftElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = leftElement;

        System.out.println("ARRAY AFTER LEFT ROTATING");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
