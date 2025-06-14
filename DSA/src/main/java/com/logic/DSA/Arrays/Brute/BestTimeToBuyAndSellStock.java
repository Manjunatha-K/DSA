package com.logic.DSA.Arrays.Brute;

public class BestTimeToBuyAndSellStock {
    private static void BuyAndSellStock(int[] arr) {
        int left = 0;
        int right = 1;
        int high = arr.length-1;
        int max = -1;
        int buy =-1;
        int sell = -1;
        while(right<high){
            if(arr[left]<arr[right]){
              buy = left;
              sell = right;
              max = Math.max(max, arr[right] - arr[left]);
              right++;
            }else{
                left = right;
                right++;
            }
        }
        System.out.println("BEST TIME TO BUY AND SELL STOCK IS : BUY :" +
                " "+buy+" - SELL : "+sell+" AND MAXIMUM PROFIT IS : "+ max);
    }
    public static void main(String[] args){
        int[] arr = {7,1,2,5,6,9,6};
        BuyAndSellStock(arr);
    }


}
