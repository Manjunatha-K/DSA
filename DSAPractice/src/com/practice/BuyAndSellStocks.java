package com.practice;

public class BuyAndSellStocks {

    private static void usingOptimal(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int profit =0;
        int maxProfite =0;

        for(int i =0;i<arr.length;i++){
            if(minPrice>arr[i])
                minPrice = arr[i];
            profit = arr[i] - minPrice;
            if(maxProfite<profit)
                maxProfite = profit;
        }
        System.out.println("using optimal is "+ maxProfite);

    }

    private static void usingBrute(int[] arr) {
        int profit =0;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
               profit = arr[j]-arr[i];
               if(profit>maxProfit){
                   maxProfit = profit;
               }
            }
        }
        System.out.println("Using Brute is : "+ maxProfit);
    }

    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        usingBrute(arr);
        usingOptimal(arr);
    }
}
