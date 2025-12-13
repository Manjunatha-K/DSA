package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeating {

    public static void main(String[] args){
        String name = "swiss";
        //Set<Character> set = new HashSet<>();
        Stream.of(name.split("")).map(x->x.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x ->!(x.getValue()>1))
                .forEach(System.out::println);

                //filter(x ->set.add(x)).forEach(System.out::println);
    }
}
