package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddAndEven {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,11,10,7);
        Map<Boolean, List<Integer>> res =  arr.stream().collect(Collectors.partitioningBy(i ->i%2 ==0));
        res.forEach((a,b)-> System.out.println(a+"-"+b));
    }
}
