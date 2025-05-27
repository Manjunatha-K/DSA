package com.logic.DSA.Arrays.Brute;

import java.util.ArrayList;
import java.util.List;

public class Sort012 {

    public static void main(String[] args){
        int[] arr = {0,1,2,0,2,1,1,2,0,1,0,2,2,1,0};
        List<Integer> zeros = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0)
                zeros.add(arr[i]);
            else if(arr[i] == 1)
                ones.add(arr[i]);
            else
                twos.add(arr[i]);
        }
        for(Integer x : zeros)
            result.add(x);

        for(Integer x : ones)
            result.add(x);

        for(Integer x : twos)
            result.add(x);
        System.out.println("THE ARRAY AFTER SORTING 0's || 1's || 2's");
        for(Integer x : result)
            System.out.println(x);


    }
}
