package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    private static void findMajorityUsingOptimal(int[] arr) {
        int ele =-1;
        int count =0;
        for(int i =1;i<arr.length;i++){
            if(count ==0){
                ele = arr[i];
                count++;
            }else if(arr[i] == ele){
                count++;
            }else{
                count--;
            }
        }
         count =0;
        for(int i =0;i<arr.length;i++){
            if(ele == arr[i]){
               count++;
            }
        }
        if(count>arr.length/2)
        System.out.println("Majority element using optimal is : "+ele);
        else{
            System.out.println("No Majority element");
        }
    }

    private static void findMajorityUsingBetter(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])>arr.length/2){
                System.out.println("Majority element using better is : "+ arr[i]);
                return;
            }
        }
        System.out.println("No majority element");
    }

    private static void findMajorityUsingBrute(int[] arr) {
        for(int i =0;i<arr.length;i++){
            int count =0;
            for(int j =0;j<arr.length;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count > arr.length/2){
                System.out.println("Majority element using brute is : "+ arr[i]);
                return;
            }
        }
        System.out.println("No Majority element");
    }
    public static void main(String[] args){
        int[] arr = {2,2,3,3,1,2,2};
        findMajorityUsingBrute(arr);
        findMajorityUsingBetter(arr);
        findMajorityUsingOptimal(arr);
    }
}
