package com.logic.DSA.BinarySearch;

import java.util.Arrays;

public class FindTheSmallestDivisorGivenThresold {

    private static void findDivisor(int[] arr, int thresold) {
        if(thresold<arr.length) {
            System.out.println("The thresold value is invalid");
            return;
        }
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(findSum(arr,mid)>thresold){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        System.out.println("The Smallest divisor is : "+ low);
    }

    private static int findSum(int[] arr, int mid) {
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum= (int) (sum+Math.ceil((double)arr[i]/mid));
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int thresold = 8;
        findDivisor(arr,thresold);
    }


}
