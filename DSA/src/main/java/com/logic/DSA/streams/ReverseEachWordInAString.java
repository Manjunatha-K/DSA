package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
       String sentences = "In these examples the arrays names " +
               "and cities store multiple strings. You can access " +
               "individual strings within the array using their index";
        System.out.println(Arrays.stream(sentences.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" ")));
        String dd = "Manh";
        Arrays.stream(dd.split("")).forEach(x-> System.out.println(x));
    }
}
