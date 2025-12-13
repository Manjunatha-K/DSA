package com.binary;

import java.util.Arrays;

public class AllocateBooks {

    private static void findEachStudentsBooks(int[] arr, int students) {
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(maxPages(arr,students,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        System.out.println(ans);
    }

    private static boolean maxPages(int[] arr, int students, int mid) {
        int count = 1;
        int capacity = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]+capacity>=mid)
            {
                capacity = arr[i];
                count++;
            }else{
                capacity+=arr[i];
            }
        }
        if(count>students)
        {
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args){
        int[] arr = {25,46,28,49,24};
        int students = 4;
        findEachStudentsBooks(arr,students);
    }


}
