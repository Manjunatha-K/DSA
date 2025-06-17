package com.logic.DSA.streams;

import java.util.Arrays;
import java.util.List;

public class Square {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,0,10);
        List<Integer> squares = arr.stream().map(a -> a*a).toList();
        System.out.println("AFTER SQUARING USING STREAMS : "+ squares);

    }
}
