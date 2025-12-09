package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondSmallest {
    public static void main(String[] args){
      int[] arr = {1,-2,4,4,3,24,5,5,7,7,7,8,9,-1,5,-100,32,2};
      findSecondSmallest(arr);
      findSecondSmallestusingStream(arr);
    }

    private static void findSecondSmallestusingStream(int[] arr) {
      Integer secondSmalest =  Arrays.stream(arr).distinct().sorted().skip(1).findFirst().getAsInt();
        System.out.println("Second Smallest using streams is : "+ secondSmalest);
    }

    private static void findSecondSmallest(int[] arr) {
        int secondSmallest = Integer.MAX_VALUE-1;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest is : "+ secondSmallest);
    }
}
