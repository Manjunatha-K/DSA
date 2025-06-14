package com.logic.DSA.Arrays.Brute;

public class MajorityElement {

    public static void main(String[] args){
        int[] arr = {1,3,4,2,2,2,1,1};
        int mid = arr.length/2;

        for(int i =0;i<arr.length;i++){
            int count =0;
            for(int j =0;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count >= mid) {
                System.out.println("Majority element is : " + arr[i]);
                return;
            }
        }
        System.out.println("There's no majority element");
    }
}
