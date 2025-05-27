package com.logic.DSA.Arrays.Brute;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 67, 8, 6, 4, 9, 0, 1, 3, 6, 77, 8, 9};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("The Largest Element in an array is : " + largest);
    }
}
