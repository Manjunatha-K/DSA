package com.logic.DSA.BinarySearch;

public class FindHowManyTimeHasArrayBeenRotated {
    private static void findCountOfRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }

                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }

        System.out.println("THE ARRAY IS ROTATED BY : "+index);
    }
    public static void main(String[] args) {
        int[] arr = {8,9,10,11,12,1,2,3,4,5,6,7};
        findCountOfRotation(arr);
    }


}
