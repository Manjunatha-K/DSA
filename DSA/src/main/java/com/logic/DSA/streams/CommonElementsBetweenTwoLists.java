package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CommonElementsBetweenTwoLists {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(0,1,2,3,6,7);
        List<Integer> arr2 = Arrays.asList(4,5,8,9,10);
        arr1.stream().filter(x ->arr2.contains(x)).forEach(x -> System.out.println(x));

    }
}
