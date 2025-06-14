package com.logic.DSA.Arrays.Brute;

public class LongestConsecutiveSequence {

    private static void consecutiveSequence(int[] arr) {
        int index = arr[0];
        int count =0;
        int maxLength = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
            if(index == arr[i]){
                count++;
                index++;
                maxLength = Math.max(count,maxLength);
            }else{
                index = arr[i]+1;
                count = 1;

            }
        System.out.println("The longest consecutive sequence size is : "+ maxLength);
    }
    public static void main(String[] args){
        int[] arr = {100,101,102,103,104,201,202,203,204,205,206,207,208, 107,108,109,110};
        consecutiveSequence(arr);
    }
}
