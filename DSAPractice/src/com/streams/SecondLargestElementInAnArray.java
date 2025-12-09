package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElementInAnArray {
    private static void findSecondLargest(List<Integer> arr){
        int secondLargest = arr.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).max(Integer::compareTo).get();
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,87,8,89,90,90);
findSecondLargest(list);
    }
}
