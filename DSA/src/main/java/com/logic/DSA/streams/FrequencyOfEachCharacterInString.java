package com.logic.DSA.streams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        String word = "AAAABBBBBCCCDDE";
        word.chars().mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                forEach((i,j) -> System.out.println(i+"--"+j));
    }
}
