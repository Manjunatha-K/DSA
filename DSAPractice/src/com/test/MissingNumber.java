package com.test;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Given an array containing numbers from 0 to N, find the missing number.
Example:

Input: [3, 0, 1] → Output: 2

 */
public class MissingNumber {

    public static  void main(String[] args){
        int[] arr = {3,0,1};

        int arrSum = Arrays.stream(arr).sum();
        int sum = (arr.length)*((arr.length)+1)/2;
        System.out.println("Missing element is : "+ (sum-arrSum));

        arr = Arrays.stream(arr).sorted().toArray(); //0,1,3
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                continue;
            }else{
                System.out.println("missing number is : "+ i);
                break;
            }
        }
    }
}
