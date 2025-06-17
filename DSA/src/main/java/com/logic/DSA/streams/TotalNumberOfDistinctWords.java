package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;

public class TotalNumberOfDistinctWords {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Apple","APple","Banana","Carrot", "Dog",
                "Eagle","Fish","Gold","High","Important","Jack","Kannada","Lion","Mango",
                "Niraj","OOPS","Pilot","QWERTY","REST","Shine","Tiger",
                "Umbrella","Violet","World","X-max","Yellow","Zebra");
        long count = words.stream().map(String::toUpperCase).distinct().count();
        System.out.println("Total Number of Distinct Words is : "+ count);

    }
}
