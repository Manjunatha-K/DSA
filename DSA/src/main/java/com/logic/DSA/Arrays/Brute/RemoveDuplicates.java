package com.logic.DSA.Arrays.Brute;

public class RemoveDuplicates {

    public static void main(String[] args){
        int[] arr = {-1,0,0,0,1,1,1,2,2,2,3,4,5};
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]== arr[j])
                continue;
            else{
                arr[j+1]= arr[i];
                j++;
            }
        }
        System.out.println("UNIQUE ELEMENTS IN AN ARRAY IS : ");
        for(int i =0;i<=j;i++){
            System.out.println(arr[i]);
        }
    }
}
