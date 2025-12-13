package com.binary;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KokoEatingBananas {
    private static void findMinNoOfBananasPerHour(int[] arr, int maxHours) {
        int max = Arrays.stream(arr).max().getAsInt();
        int low = 1;
        int high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHours = calculateTotalHours(arr, mid);
            if (totalHours > maxHours) {
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = mid;
            }
        }
        System.out.println("Minimum number of bananas is : "+ ans);
    }

    private static int calculateTotalHours(int[] arr, int mid) {
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHours += (int) Math.ceil((double) arr[i] / mid);
        }
        return totalHours;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int maxHours = 8;
        findMinNoOfBananasPerHour(arr, maxHours);
    }


}
