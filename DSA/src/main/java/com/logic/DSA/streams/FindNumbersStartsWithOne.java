package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartsWithOne {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,11,12,13,1,4,1,5,16,17,23,22,0);
        List<String> res = nums.stream().map(num -> String.valueOf(num)).
                filter(word ->word.startsWith("1")).
                collect(Collectors.toList());
        System.out.println("NUMBERS THAT STARTS WITH 1 are : "+ res);
    }
}
