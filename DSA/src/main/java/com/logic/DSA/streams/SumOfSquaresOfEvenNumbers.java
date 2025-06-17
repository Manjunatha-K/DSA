package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14);
         long sum = nums.stream().mapToInt(num ->num*num).filter(num ->num%2 ==0).sum();
        System.out.println("SQUARES OF EVEN NUMBERS : "+ sum);
    }
}
