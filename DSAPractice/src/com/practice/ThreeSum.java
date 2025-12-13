package com.practice;

import java.util.*;

public class ThreeSum {

    private static void find3SumOptimal(int[] arr) {
        Arrays.sort(arr);
        // Store final result
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        // First loop for first element
        for (int i = 0; i < n; i++) {
            // Skip duplicates for first element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Two pointers
            int left = i + 1, right = n - 1;

            // Find pairs for current arr[i]
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    // Skip duplicates for left
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    // Skip duplicates for right
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }
        System.out.println("Three sum using Optimal is :");
        ans.forEach(System.out::println);
        //return ans;
    }

    private static void find3SumBetter(int[] arr) {
        int sum = 0;
        Set<Integer> temp = new HashSet<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int remaining = -(arr[i] + arr[j]);
                if (temp.contains(remaining)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(remaining);
                    Collections.sort(list);
                    set.add(list);
                }
                temp.add(arr[j]);
            }
        }
        System.out.println("Three Sum using Better is : ");
        set.forEach(System.out::println);
    }

    private static void find3SumBrute(int[] arr) {
        int sum = 0;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        System.out.println("The three sum using Brute is : ");
        set.forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, 4};
        find3SumBrute(arr);
        find3SumBetter(arr);
        find3SumOptimal(arr);
    }
}
