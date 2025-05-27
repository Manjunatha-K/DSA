package com.logic.DSA.Arrays.Brute;

public class SecondSmallest {
    public static void main(String[] args){
        int[] arr = {1, 2, 34, 77, 8, 6, 4, 9, 0, 1, 3, 6, 77, 8, 9};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = smallest-1;

        for(int i =0;i<arr.length;i++){
            if(arr[i]< smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]< secondSmallest && arr[i]>smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("The SECOND SMALLEST ELEMENT IS : "+ secondSmallest);

    }
}
