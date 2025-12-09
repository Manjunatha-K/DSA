package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.List;

public class CommonElementsBetweenTwoLists2 {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(0,1,2,3,6,7,4,5,8);
        List<Integer> arr2 = Arrays.asList(4,5,8,9,10);
        arr1.stream().filter(arr2::contains).forEach(System.out::println);
    }
}
