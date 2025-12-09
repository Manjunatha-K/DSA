package com.practice;

import java.util.Arrays;

public class FindSmallest {

    public static void main(String[] args){
        int[] arr = {1,-2,4,4,3,24,5,5,7,7,7,8,9,-1,5,-100,32,2};
        findSmallest(arr);
        findSmallestUsingStream(arr);
    }

    private static void findSmallestUsingStream(int[] arr) {
        int smallest = Arrays.stream(arr).min().getAsInt();
        System.out.println("Smallest using stream is : "+smallest);

    }

    private static void findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(smallest>arr[i])
                smallest = arr[i];
        }
        System.out.println("Smallest is : "+smallest);
    }
}
