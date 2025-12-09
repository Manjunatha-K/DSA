package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesElements2 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,1,2,3,1,2,31,4,5,6,7,8,9,9,0,0,11,12);
        Set<Integer> set = new HashSet<>();
        List<Integer> results = nums.stream().filter(x -> !set.add(x)).toList();
        results.stream().forEach(System.out::println);
    }
}
