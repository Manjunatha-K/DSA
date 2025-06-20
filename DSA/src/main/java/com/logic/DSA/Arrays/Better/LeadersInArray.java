package com.logic.DSA.Arrays.Better;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {1,9,6,8,3,2,6,5,4,10};
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        for(int i =n-1;i>=0;i--){
            if(arr[i]> max) {
                res.add(arr[i]);
                max = arr[i];
            }
        }
        res.forEach(i -> System.out.println(i));
    }
}
