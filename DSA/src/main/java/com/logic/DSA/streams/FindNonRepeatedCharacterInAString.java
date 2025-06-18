package com.logic.DSA.streams;

import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacterInAString {
    public static void main(String[] args) {
        String word = "AABBCDEEFGGHHIJKLLLMMNOOOO";
        Map<Character, Long> map = word.chars().
                mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.entrySet().stream().filter(entry ->entry.getValue() ==1)
                .map(entry ->entry.getKey())
                .collect(Collectors.toList()).
                forEach(i-> System.out.println(i));


    }
}
