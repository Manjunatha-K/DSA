package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnionOfTwoSortedArrays {
    private static void unionUsingStreams(int[] arr1, int[] arr2) {
        int[] results = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
        System.out.println("Union of two sorted arrays using streams");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }

    private static void unions(int[] arr1, int[] arr2) {
        List<Integer> results = new ArrayList<>();
        Collections.sort(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
        Collections.sort(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if ((arr1[i] <= arr2[j])) {
                if (!results.contains(arr1[i]))
                    results.add(arr1[i]);
                i++;
            } else if ((arr1[i] > arr2[j])) {
                if (!results.contains(arr2[j]))
                    results.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            if (!results.contains(arr1[i]))
                results.add(arr1[i]);
            i++;

        }
        while (j < arr2.length) {
            if (!results.contains(arr2[j]))
                results.add(arr2[j]);
            j++;

        }
        System.out.println("Union of two sorted Arrays");
        for (Integer result : results) {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {5, 6, 7, 8, 9, 10};
        unions(arr1, arr2);
        unionUsingStreams(arr1, arr2);
    }


}
