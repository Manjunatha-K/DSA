package com.binary;

public class FindPeakElement {

    private static void findPeak(int[] arr) {
        if (arr.length == 1) {
            System.out.println("Peak element is : " + arr[0]);
            return;
        }
        if (arr[0] > arr[1]) {
            System.out.println("Peak element is : " + arr[0]);
            return;
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            System.out.println("Peak element is : " + arr[arr.length - 1]);
            return;
        }

        int low = 1;
        int high = arr.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println("Peak element is : " + arr[mid]);
                return;
            } else if (arr[mid]>arr[mid-1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,5,1};
        findPeak(arr);
    }


}
