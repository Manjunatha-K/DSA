package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeftRotateTheArrayByDplaces {
    private static void leftrotateByDPlacesUsingStreams(int[] arr, int d) {
        d = d % arr.length;

        IntStream stream1 = Arrays.stream(arr, 0, d);
        List<Integer> list1 = new java.util.ArrayList<>(stream1.boxed().toList());
        Collections.reverse(list1);

        IntStream stream2 = Arrays.stream(arr, d, arr.length);
        List<Integer> list2 = new java.util.ArrayList<>(stream2.boxed().toList());
        Collections.reverse(list2);
        IntStream resultStream = IntStream.concat(list1.stream().mapToInt(i -> i), list2.stream().mapToInt(i -> i));

        List<Integer> results = new java.util.ArrayList<>(resultStream.boxed().toList());
        Collections.reverse(results);
        System.out.println("After rotating the array by D places using stream");
        System.out.println(results.toString());
    }

    private static void leftRotateByDPlaces(int[] arr, int d) {
        int[] arr1 = new int[d];
        int[] arr2 = new int[arr.length - d];
        for (int i = 0; i < d; i++)
            arr1[i] = arr[i];

        arr1 = reverseArray(arr1);
        for (int i = d; i < arr.length; i++)
            arr2[i-d] = arr[i];
        arr2 = reverseArray(arr2);

        IntStream result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2));
        int[] resultArray = result.toArray();
        resultArray = reverseArray(resultArray);
        System.out.println("After rotating the array by D places");
        for (int i = 0; i < resultArray.length; i++)
            System.out.println(resultArray[i]);

    }

    private static int[] reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int temp;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d = 3;
        leftRotateByDPlaces(arr, d);
        leftrotateByDPlacesUsingStreams(arr, d);
    }


}
