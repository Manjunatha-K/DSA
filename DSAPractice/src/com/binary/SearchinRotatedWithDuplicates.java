package com.binary;

public class SearchinRotatedWithDuplicates {
    private static void search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            } else if (arr[low] < arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        if (index < 0)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at index : " + index);

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int target = 1;
        search(arr, target);
    }

}
