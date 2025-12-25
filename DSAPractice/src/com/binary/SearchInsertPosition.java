package com.binary;

public class SearchInsertPosition {
    private static void searchPosition(int[] arr, int target) {
        int low = 0, high = arr.length;
        int ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=target){
                ans = mid;
                low= mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println("Insert position is : "+ ans+" and the value is : "+arr[ans]);
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,7};
        int target = 3;
        searchPosition(arr,target);
    }


}
