package com.logic.DSA.Arrays.Better;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5, 6, 7, 4, 5, 4, 4, 4, 5, 5};
        int target = 14;
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (target == sortedArray[i] + sortedArray[j] + sortedArray[k]) {
                    System.out.println("The values that Three sum equals is : " +
                            sortedArray[i] + "-" + sortedArray[j] + "-" + sortedArray[k]);
                    return;
                } else if (target > sortedArray[i] + sortedArray[j] + sortedArray[k])
                    j++;
                else
                    k--;
            }
        }
        System.out.println("There is no Three Sum");
    }
    }

