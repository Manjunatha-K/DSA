package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRotateTheArrayByOnePlace {

    private static void leftRotateUsingStreams(int[] arr) {

        IntStream stream1 = Arrays.stream(arr,0,arr.length);
        IntStream stream2 = Arrays.stream(arr,0,0);

        IntStream result = IntStream.concat(stream1,stream2);
        System.out.println("After rotating using streams");
        result.forEach(System.out::println);
    }

    private static void leftRotate(int[] arr) {
        int ele = arr[0];
        for(int i =1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = ele;

        System.out.println("After rotating");
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
      int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
      leftRotate(arr);
      leftRotateUsingStreams(arr);
    }


}
