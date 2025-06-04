package com.logic.DSA.Arrays.Brute;

public class FindTheMissingNumberInAnArray {

    private static void missingNumber(int[] arr) {
        int n = arr.length;
        int x = arr[0];
        for(Integer i : arr){
            if(i != x){
                System.out.println("THE MISSING NUMBER IS : "+ x);
                return;
            }else
                x++;
        }
    }
    public static void main(String[] args){
        int arr[] = {98,99,101,102,103,104};
        missingNumber(arr);
    }


}
