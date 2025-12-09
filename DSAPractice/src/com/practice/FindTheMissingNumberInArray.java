package com.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindTheMissingNumberInArray {

    private static void findMissingNumberUsingOptimal(int[] arr) {
        int valueSum = 0;
        int sum =0;
        for(int i =0;i<arr.length;i++){
            valueSum+=arr[i];
            sum+=(i+1);
        }
        System.out.println("Missing number using optimal is : "+( valueSum - sum));
    }

    private static void findMissingNumberUsingBetter(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] temp = new int[max+1];
        for(int i =0;i<arr.length;i++){
            temp[arr[i]] = 1;
        }
        for(int j =1;j<temp.length;j++){
            if(temp[j] == 0){
                System.out.println("Missing number using better is : "+j);
                break;
            }
        }
    }

    private static void findMissingNumberUsingBrute(int[] arr) {
        for(int i =0;i<arr.length;i++){
            if(i+1 != arr[i]){
                System.out.println("Missing Number using brute is : "+(i+1));
                break;
            }
        }
    }

    private static void findMissingNumberUsingStreams(int[] arr) {
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        findMissingNumberUsingStreams(arr);
        findMissingNumberUsingBrute(arr);
        findMissingNumberUsingBetter(arr);
        findMissingNumberUsingOptimal(arr);
    }

}
