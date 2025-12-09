package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddAndEven2 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,11,10,7);
        Map<Boolean,List<Integer>> re = arr.stream().collect(Collectors.partitioningBy(i ->i%2 ==0));
        re.forEach((i,j)-> System.out.println(i +" -- "+ j));
    }
}
