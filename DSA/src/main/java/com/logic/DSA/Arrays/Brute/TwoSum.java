package com.logic.DSA.Arrays.Brute;

public class TwoSum {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3};
        int target = 10;
        for(int i =0;i< arr.length;i++){
            for(int j =0;j< arr.length;j++){
                if(arr[i]+arr[j] == target)
                    System.out.println("The two elements are : "+arr[i]+" and "+arr[j]);
                break;
            }
        }
    }
}
