package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargest {
    private static void findSecondLargest(int[] arr) {
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest ){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest is : " + secondLargest);
    }

    private static void findSecondLargestUsingStream(int[] arr) {
        int secondLargest = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Largest using stream is : "+ secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 6, 8, 0, 49, 44, 44};
        findSecondLargest(arr);
        findSecondLargestUsingStream(arr);
    }


}
