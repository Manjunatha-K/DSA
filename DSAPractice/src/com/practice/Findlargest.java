package com.practice;

import java.util.Arrays;

public class Findlargest {
    private static void findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.println("Largest is : "+largest);
    }
    private static void findLargestUsingStream(int[] arr) {
        int largest = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest using stream is : "+largest);
    }
    public static void main(String[] args) {
        int[] arr  ={1,8,3,6,8,0,49,50,44};
        findLargest(arr);
        findLargestUsingStream(arr);
    }


}
