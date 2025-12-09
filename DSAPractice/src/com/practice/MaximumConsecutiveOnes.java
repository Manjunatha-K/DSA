package com.practice;

public class MaximumConsecutiveOnes {
    private static void maximumConsecutiveones(int[] arr) {
        int count =0;int maxCount =-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] ==1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else{
                count = 0;
            }
        }
        System.out.println("Maximum consecutive ones is : "+maxCount);
    }
    public static void main(String[] args){
       int[] arr = {1,1,0,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1};
       maximumConsecutiveones(arr);
    }


}
