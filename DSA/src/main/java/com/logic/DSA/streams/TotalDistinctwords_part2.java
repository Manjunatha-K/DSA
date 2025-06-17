package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;

public class TotalDistinctwords_part2 {
    public static void main(String[] args){
        List<String> sentences = Arrays.asList("In these examples",
                "the arrays names and cities store multiple strings.",
                " You can access individual strings within the array using their index");
        long count = sentences.stream().
                flatMap(word ->Arrays.stream(word.split(" "))).distinct().count();
        System.out.println("Total Number of Distinct Words is : "+ count);
    }
}
