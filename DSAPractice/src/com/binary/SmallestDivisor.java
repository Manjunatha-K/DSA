package com.binary;

import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7};
        int thresold = 6;
        findDivisor(arr, thresold);
    }

    private static void findDivisor(int[] arr, int thresold) {
        int ans = -1;
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (divisor(arr, mid, thresold)) {
                high = mid - 1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }

    private static boolean divisor(int[] arr, int mid, int thresold) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += (int) Math.ceil((double) arr[i] / mid);
        }
        if (total <= thresold)
            return true;
        else
            return false;
    }
}
