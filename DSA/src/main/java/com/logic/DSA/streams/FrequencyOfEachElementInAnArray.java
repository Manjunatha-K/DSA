package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInAnArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,5,6,7,8,9,0);
        arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                forEach((i,j)-> System.out.println(i+"--"+j));
    }
}
