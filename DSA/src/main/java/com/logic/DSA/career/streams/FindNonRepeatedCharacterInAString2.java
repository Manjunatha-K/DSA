package com.logic.DSA.career.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacterInAString2 {
    public static void main(String[] args) {
        String word = "AABBCDEEFGGHHIJKLLLMMNOOOO";

        Map<Character, Long> map = word.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(entry -> entry.getValue() ==1).forEach(System.out::println);
    }
}
