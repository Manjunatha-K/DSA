package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartsWithOne2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,11,2,3,4,12,13,14,11111,16,90);
        nums.stream().filter(x ->String.valueOf(x).startsWith("1")).forEach(System.out::println );
    }
}
