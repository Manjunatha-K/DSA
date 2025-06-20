package com.logic.DSA.Arrays.Better;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeftRotateByDPlaces {
    public static void main(String[] args) throws NumberFormatException{
        int[] arr ={0,1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        System.out.println(n+"====");
        final int d = 3%n;
        reverseArray(arr, 0,d);
        reverseArray(arr,d,n-1);
        reverseArray(arr, 0, n-1);
        System.out.println("AFTER ROTATING BY D PLACES");
        for (int i : arr) {
            System.out.println(i);
        }

    }
private static void reverseArray(int[] arr,int d,int n){
   while(d<n){
       int temp = arr[d];
       arr[d] = arr[n];
       arr[n] = temp;
       d++;
       n--;
   }
}
}
