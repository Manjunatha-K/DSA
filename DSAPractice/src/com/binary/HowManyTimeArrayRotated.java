package com.binary;

public class HowManyTimeArrayRotated {
    private static void findMinimum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
             if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid ;
            }
        }
        System.out.println("Index  is : " + low);
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 11, 1, 2, 3, 4, 5, 6};
        findMinimum(arr);
    }
}
