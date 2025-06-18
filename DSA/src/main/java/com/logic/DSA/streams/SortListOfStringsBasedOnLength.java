package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringsBasedOnLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","APple","Banana","Carrot", "Dog",
                "Eagle","Fish","Gold","High","Important","Jack","Kannada","Lion","Mango",
                "Niraj","OOPS","Pilot","QWERTY","REST","Shine","Tiger",
                "Umbrella","Violet","World","X-max","Yellow","Zebra");
        words.stream().sorted(Comparator.comparing(x ->x.length())).forEach(x -> System.out.println(x));
    }
}
