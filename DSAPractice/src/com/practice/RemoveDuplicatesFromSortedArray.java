package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    private static void removeduplicatesUsingStreams(int[] arr) {
        List<Integer> results = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        System.out.println("Unique elements using streams is :");
        for (Integer result : results) {
            System.out.println(result);
        }
    }

    private static void removeDuplicates(int[] arr) {
        List<Integer> distinct = new ArrayList<>();
        int j = 0;
        for(int i = 0;i<arr.length;i++){
           if(arr[i] != arr[j]){
               distinct.add(arr[j]);
               j = i;
           }
        }
        System.out.println("Unique elements in an array is :");
        distinct.forEach(a -> System.out.println(a));
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,2,2,2,3,3,3,3,4,4,4,5,5,5,6};
        removeDuplicates(arr);
        removeduplicatesUsingStreams(arr);

    }
}
