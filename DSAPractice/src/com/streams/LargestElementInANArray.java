package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestElementInANArray {
   private static void findLargest(List<Integer> list){
      Integer largest =  list.stream().max(Integer::compareTo).get();
       System.out.println(largest);

    }
   public static void main(String[] args) {
       int[] arr = {1,2,4,3,5,6,7,88,9,0,1,3,5,6};
       findLargest(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}
