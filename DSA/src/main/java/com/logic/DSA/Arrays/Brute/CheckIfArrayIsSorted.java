package com.logic.DSA.Arrays.Brute;

public class CheckIfArrayIsSorted {
    private static void isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                continue;
            } else {
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("ARRAY IS SORTED");
        return;
    }

    public static void main(String args[]) {
        int[] arr = {-5,-3,-2,1,0,1,2,3,4,5};
        isSorted(arr);
    }

}
