package com.logic.DSA.BinarySearch;

import java.util.Arrays;

/*
 monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’
 bananas. An integer ‘h’ is also given, which denotes the time (in hours) for
 all the bananas to be eaten.
Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas.
If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas
and won’t eat any more bananas in that hour.
Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.
 */
public class KokoEatingBananas {
    private static void findKNoOfBananas(int[] arr, int hours) {
        int low = 0;
        int high = Arrays.stream(arr).max().getAsInt();
        int mid = -1;
        int k = -1;
        int ans = -1;
        while(low<=high){
            mid = (low+high)/2;

            k = findK(arr,mid);
            if(k>hours){
                low = mid+1;
            }else {
                ans = mid;
                high = mid-1;
            }
        }
        System.out.println("The Minimum Number of Bananas that a monkey should eat is : "+ans);
    }

    private static int findK(int[] arr, int mid) {
        int total = 0;
        for(int i =0;i<arr.length;i++){
            total = (int) (total + Math.ceil((double) arr[i]/(double) mid));
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,4,1,7};
        //Min Hours = 5 hours - size of an array and k = 7 for that to happen
        /*
        if k = 7, h = 5
        if k = 6, h = 6
        if k = 5 , h = 6
        if k =4 , h = 7
        if k = 3, h = 9
        if k = 2, h =12
        if k =1, h =20;
         */
        int hours = 10;
        findKNoOfBananas(arr,hours);
    }


}
