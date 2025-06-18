package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,6,7};
        int[] arr2 = {4,5,8,9,10};

        int[] res = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        for (int re : res) {
            System.out.println(re);
        }
    }
}
