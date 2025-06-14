package com.logic.DSA.Arrays.Brute;

public class RearrangeByPlusAndMinusSign {

    public static void main(String[] args){
        int[] arr = {-1,-2,-3,-4,1,2,3,7};
        int negIndex = 0;
        int posIndex = 1;
        int res[] = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0) {
                res[negIndex] = arr[i];
                negIndex+=2;
            }else{
                res[posIndex] = arr[i];
                posIndex+=2;
            }
        }
        System.out.println("AFTER ARRANGING");
        for(int i =0;i<res.length;i++)
            System.out.println(res[i]);
    }
}
