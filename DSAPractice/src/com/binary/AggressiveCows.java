package com.binary;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AggressiveCows {

    private static void findMinDist(int[] arr, int cows) {
        arr = Arrays.stream(arr).sorted().toArray();
        int low = 0;
        int ans = -1;
        int high = arr[arr.length - 1] - arr[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canWePlace(arr, mid, cows)) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        System.out.println("Min distance is : "+ans);
    }

    private static boolean canWePlace(int[] arr, int mid, int cows) {
        int lastCow = arr[0];
        int countCows = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastCow >= mid) {
                countCows++;
                lastCow = arr[i];
            }
        }
        if (countCows >= cows)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 7, 10, 9};
        int cows = 4;
        findMinDist(arr, cows);
    }

}
