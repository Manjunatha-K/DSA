package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinationOfFirsttwoStringwithEvenLengths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","APple","Banana","Carrote", "Dog",
                "Eagle","Fish","Gold","High","Important","Jack","Kannada","Lion","Mango",
                "Niraj","OOPS","Pilot","QWERTY","REST","Shine","Tiger",
                "Umbrella","Violet","World","X-max","Yellow","Zebra");
        String sentence = words.stream().filter(word -> word.length()%2 ==0)
                .limit(2).collect(Collectors.joining());
        System.out.println("CONCATION OF FIRST TWO EVEN STRINGS : "+sentence);
    }

}
