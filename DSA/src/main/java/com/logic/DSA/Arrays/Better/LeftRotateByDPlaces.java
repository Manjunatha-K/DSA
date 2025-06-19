package com.logic.DSA.Arrays.Better;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRotateByDPlaces {
    public static void main(String[] args) throws NumberFormatException{
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        final int d = 15%n;
        int[] arr1 = Arrays.stream(arr).limit(d).
                map( i ->arr[d-i]).toArray();

        int[] arr2 = reverseArray(arr,d);
        int[] res = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
        Arrays.stream(res).mapToObj(a-> new StringBuilder(a).reverse()).forEach(i -> System.out.println(i));
    }

    private static int[] reverseArray(int[] arr, int d) {
        int n = arr.length-1;
        while(d<n){
            int temp = arr[d];
            arr[d] = arr[n];
            arr[n] = temp;
            d++;
            n--;
        }
        return arr;
    }
}
