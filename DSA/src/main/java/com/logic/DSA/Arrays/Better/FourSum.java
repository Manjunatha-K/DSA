package com.logic.DSA.Arrays.Better;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6,7,4,5,4,4,4,5,5};
        int target = 14;
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    if(target == sortedArray[i]+ sortedArray[j]+sortedArray[k]+sortedArray[l]){
                        System.out.println("The values that four sum equals is : "+
                                sortedArray[i]+"-"+sortedArray[j]+"-"+sortedArray[k]+"-"+sortedArray[l]);
                        return;
                    }else if(target > sortedArray[i]+ sortedArray[j]+sortedArray[k]+sortedArray[l])
                        k++;
                    else
                        l--;
                }
            }
        }
        System.out.println("There is no Four Sum");
    }
}
