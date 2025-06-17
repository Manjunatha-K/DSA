package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,1,2,3,1,2,31,4,5,6,7,8,9,9,0,0,11,12);
        HashSet<Integer> set = new HashSet<>();
        nums.stream().filter(n->!set.add(n)).
                forEach(n -> System.out.println("DUPLICATES FROM THE LIST IS : "+n));

    }
}
