package com.binary;

import java.util.Arrays;

public class LeastCapacityToShipPackage {
    private static void findLeastCapacity(int[] weights, int d) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (findNoOfDays(weights, mid, d)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Least Capacity is : " + ans);
    }

    private static boolean findNoOfDays(int[] weights, int mid, int d) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > mid) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        if (days <= d)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d = 10;
        findLeastCapacity(weights, d);
    }


}
