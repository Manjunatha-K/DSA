package com.binary;

public class BinarySearch {
    private static void binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Found the element at : " + mid + " and the value is : " + arr[mid]);
                return;
            } else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("Element doesn't exists");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 7, 90, 110, 120, 167, 167, 170, 230};
        int target = 91;
        binarySearch(arr, target);
    }
}
