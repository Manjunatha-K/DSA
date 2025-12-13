package com.binary;

import java.util.Arrays;

public class MBouquets {

    private static void findMinDays(int[] arr, int m, int k) {
        int low = 0;
        int ans = -1;
        int high = Arrays.stream(arr).max().getAsInt();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int boqu = findDays(arr, mid, k);
            if (boqu >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Ans is : " + ans);
    }

    private static int findDays(int[] arr, int mid, int k) {
        int counter = 0;
        int bouq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mid) {
                counter++;
            } else {
                bouq += counter / k;
                counter = 0;
            }
        }
        bouq += counter / k;
        return bouq;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        findMinDays(arr, m, k);
    }

}
