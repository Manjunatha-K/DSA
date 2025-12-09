package com.logic.DSA.career.streams;

import java.util.Arrays;
import java.util.List;

public class LengthOfLongestName2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Banana","Carrot", "Dog",
                "Eagle","Fish","Gold","High","Jack","Kannada","Lion","Mango",
                "Niraj","OOPS","Pilot","QWERTY","REST");
       int length =  words.stream().map(a ->a.length()).max((i,j)->Integer.compare(i,j)).get();
        System.out.println(length);
    }
}
