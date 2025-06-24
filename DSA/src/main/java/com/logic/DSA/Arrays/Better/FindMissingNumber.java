package com.logic.DSA.Arrays.Better;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        long max = Arrays.stream(arr).boxed()
                .collect(Collectors.toList()).stream()
                .max((a,b) -> Integer.compare(a,b)).get();
        long sum = (max*(max+1))/2;
        int alistSum = Arrays.stream(arr).sum();
        System.out.println("Missing number is : "+ (sum - alistSum));
    }
}
