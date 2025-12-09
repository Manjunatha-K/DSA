package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {

    private static void TwoSumUsingOptimal(int[] arr, int target) {
        arr =  Arrays.stream(arr).boxed().mapToInt(i ->i).sorted().toArray();
        int left =0; int right = arr.length-1;
        while(left< right){
            if(arr[left] + arr[right]== target){
                System.out.println("Two SUm using optimal is : "+arr[left] +" - "+arr[right]);
                break;
            }else if( arr[left]+arr[right]> target)
                right--;
            else
                left++;
        }
    }

    private static void TwoSumUsingBetter(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int remaining = target-arr[i];
            if(map.containsKey(remaining)){
                System.out.println("Two sum using better is : "+map.get(remaining)+" - "+i);
                break;
            }
            map.put(arr[i],i);
        }
    }

    private static void TwoSumUsingBrute(int[] arr, int target) {

        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Two sum using brute is : "+ i+" - "+j);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        TwoSumUsingBrute(arr, target);
        TwoSumUsingBetter(arr, target);
        TwoSumUsingOptimal(arr, target);
    }

}
