package com.logic.DSA.Arrays.Better;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr ={2,1,0,1,1,2,2,2,0,0,0,1,2,0,0,1,2};
        int low= 0,mid=0,high =arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swapEle(arr,low,mid);
                mid++;
                low++;
            }else if( arr[mid] == 1)
                mid++;
            else{
                swapEle(arr,mid,high);
                high--;
            }
        }
        System.out.println("AFTER SORTING : ");
        for (int ele : arr)
            System.out.println(ele);
    }

    private static void swapEle(int[] arr,int low, int mid) {
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
    }
}
