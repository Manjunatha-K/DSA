package com.logic.DSA.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfANumber {
    public static void main(String[] args) {
        Integer num = 12345;
       int res =  Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(i ->Integer.parseInt(i)));
        System.out.println(res);
    }
}
