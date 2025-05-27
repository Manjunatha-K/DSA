package com.logic.DSA.Arrays.Brute;

public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {1, 2, 34, 77, 8, 6, 4, 9, 0, 1, 3, 6, 77, 8, 9};

        int largest = Integer.MIN_VALUE;
        int secondLargest = largest+1;

        for(int i =0;i<arr.length;i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]> secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("The SECOND LARGEST ELEMENT IS : "+ secondLargest);

    }
}
