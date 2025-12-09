package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovingZerosToEnd {
    private static void moveZerosToEndUsingStreams(int[] arr) {
        List<Integer> result = new java.util.ArrayList<>(Arrays.stream(arr).boxed().filter(a -> a != 0).toList());
        List<Integer> zeros = Arrays.stream(arr).boxed().filter(a ->a==0).toList();
        result.addAll(zeros);
        System.out.println("After moving zeros to end using streams");
        result.stream().forEach(System.out::print);

    }

    private static void moveZerostoEnd(int[] arr) {
        int zeroPointer =-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0){
                zeroPointer = i;
                break;
            }
        }
        if(zeroPointer <0){
            System.out.println("No zeros in the array");
        }else {
            int j = zeroPointer + 1;
            while(j<arr.length){
                if(arr[j] !=0 ){
                    swapping(arr,j,zeroPointer);
                    zeroPointer ++;
                }
                j++;
            }
        }
        System.out.println("After moving zeros to end");
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swapping(int[] arr, int j, int zeroPointer) {
        int temp = arr[j];
        arr[j] = arr[zeroPointer];
        arr[zeroPointer] = temp;
    }

    public static void main(String[] args){
     int[] arr = {1,0,2,0,3,0,0,0,4,56};
     moveZerostoEnd(arr);
     moveZerosToEndUsingStreams(arr);
    }


}

