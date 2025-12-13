package com.binary;

public class SearchInARotatedSortedArray {
    private static void search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                index = mid;
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && arr[mid] >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && arr[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        if (index >= 0) {
            System.out.println("The element is present at index : " + index);
        } else {
            System.out.println("Element is not present");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10,0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8};
        int target = 1;
        search(arr, target);
    }


}
