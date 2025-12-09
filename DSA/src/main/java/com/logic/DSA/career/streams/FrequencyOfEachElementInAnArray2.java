package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInAnArray2 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,2,3,4,4,5,6,6,7,8,90,0,0);
        arr.stream().collect(Collectors
                .groupingBy(Function.identity(),Collectors.counting())).
                forEach((i,j)-> System.out.println(i+" -- "+j));
    }
}
