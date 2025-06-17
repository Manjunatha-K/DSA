package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;

public class LengthOfLongestName {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Apple","Banana","Carrot", "Dog",
                "Eagle","Fish","Gold","High","Jack","Kannada","Lion","Mango",
                "Niraj","OOPS","Pilot","QWERTY","REST");
        long length = words.stream().map(a ->a.length())
                .max((a,b)->Integer.compare(a,b)).get();
        System.out.println("THE LONGEST LENGTH OF AN INTEGER IS : "+ length);
    }
}
