package com.logic.DSA.BinarySearch;

import java.util.Arrays;

public class KthMissingPositiveNumber {

    private static void findKthMissingValue(int[] arr, int k) {
      int low =1;
      int high = arr.length-1;
      int mid = -1;
      int ans = -1;
      while(low<=high){
          mid = (low+high)/2;
          int missing = arr[mid]-(mid+1);
          if(missing < k) {
              low = mid + 1;
          }
          else {
              high = mid - 1;
          }
          }
        System.out.println("The Missing number is : "+ (high+k+1));
      }

    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 4;
        findKthMissingValue(arr,k);
    }


}
