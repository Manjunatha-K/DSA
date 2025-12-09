package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinationOfFirsttwoStringwithEvenLengths2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","APple","Banana","Carrote", "Dog",
                "Eagle","Fish","Gold","High","Important","Jack","Kannada","Lion","Mango",
                "Niraj","OOPS","Pilot","QWERTY","REST","Shine","Tiger",
                "Umbrella","Violet","World","X-max","Yellow","Zebra");

        String result = words.stream().filter(x ->x.length()%2 ==0).limit(2).collect(Collectors.joining());
        System.out.println("The concatination of first two even length strings are "+ result);
    }
}
