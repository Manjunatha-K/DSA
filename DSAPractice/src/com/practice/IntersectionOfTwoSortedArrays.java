package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class IntersectionOfTwoSortedArrays {

    private static void intersectionUsingStreams(int[] arr1, int[] arr2) {
        List<Integer> list1 = Arrays.stream(arr1).boxed().toList();
        List<Integer> result = Arrays.stream(arr2).boxed().filter(list1::contains).toList();
        System.out.println("Intersection of tow sorted arrays using streams is ");
        result.forEach(System.out::print);
    }

    private static void intersection(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> list1 = new ArrayList<>(Arrays.stream(arr1).boxed().toList());
        List<Integer> list2 = new ArrayList<>(Arrays.stream(arr2).boxed().toList());
        Collections.sort(list1);
        Collections.sort(list2);
        arr1 = list1.stream().mapToInt(x ->x).toArray();
        arr2 = list2.stream().mapToInt(x ->x).toArray();
        ArrayList<Integer> result = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println("Intersection of two sorted arrays is");
        result.forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9};
        int[] arr2 = {3, 4, 5, 6, 7, 7};
        intersection(arr1, arr2);
        intersectionUsingStreams(arr1, arr2);

    }


}
