package com.logic.DSA.Arrays.Brute;

public class ThreeSum {

    public static void main(String[] args){
        int[] arr = {1, 2, 34, 67, 8, 6, 4, 9, 0, 1, 3, 6, 77, 8, 9};
        int target = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println("THE TRIPLETS EXISTS : "+arr[i]+"-"+arr[j]+"-"+arr[k]);
                        break;
                    }
                }
            }
        }
        System.out.println("NO TRIPLETS");
    }
}
