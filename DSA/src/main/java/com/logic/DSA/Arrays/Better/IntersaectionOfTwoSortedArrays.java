package com.logic.DSA.Arrays.Better;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersaectionOfTwoSortedArrays {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,7,4,1,9,3,0,2,10,14);
        List<Integer> list2 = Arrays.asList(1,11,12,1,3,4,5,2,14,2);
        list1  = list1.stream().sorted().collect(Collectors.toList());
        list2 = list2.stream().sorted().collect(Collectors.toList());
        List<Integer> res = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int i =0,j =0;
        while(i<size1 && j<size2){
            if(list1.get(i)<(list2.get(j))){
                i++;
            }else if(list1.get(i)>(list2.get(j)))
                j++;
            else {
                res.add(list1.get(i));
                i++;
                j++;
            }
        }
        System.out.println("THE INTERSECTION OF TWO ARRAYS ARE :");
        res.stream().forEach(System.out::println);
    }
}
