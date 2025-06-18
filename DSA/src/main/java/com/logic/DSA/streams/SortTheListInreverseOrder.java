package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTheListInreverseOrder {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-1,2);
        nums.stream().sorted(Comparator.reverseOrder()).
                forEach(i-> System.out.println(i));
    }
}
