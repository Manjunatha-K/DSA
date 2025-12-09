package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInAString2 {
    public static void main(String[] args) {
        String sentences = "In these examples the arrays names " +
                "and cities store multiple strings. You can access " +
                "individual strings within the array using their index";
        System.out.println(Arrays.stream(sentences.split(" ")).map(x -> new StringBuffer(x).reverse()).collect(Collectors.joining(" ")));
    }
}
