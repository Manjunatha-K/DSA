package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    private static void findLeadersUsingOptimal(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i =arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        System.out.println("Leader using Optimal approach is : ");
        list.forEach(System.out::println);
    }

    private static void findLeadersUsingBrute(int[] arr) {
        List<Integer> list= new ArrayList<>();
        int ele;
        boolean isLeader=true;
        for(int i =0;i<arr.length;i++){
            ele = arr[i];
            isLeader=true;
            for(int j =i+1;j<arr.length;j++){
                if(ele<arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
                list.add(ele);
        }
        System.out.println("Leader in an array using brute is : ");
        list.forEach(System.out::println);
    }

    public static void main(String[] args){
        int[] arr = {10,22,12,3,0,6};
        findLeadersUsingBrute(arr);
        findLeadersUsingOptimal(arr);
    }


}
