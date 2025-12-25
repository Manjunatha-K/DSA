package com.binary;

public class Recursive {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 7, 90, 110, 120, 167, 167, 170, 230};
        int target = 90;
        int found = recuriveImpl(arr, 0, arr.length - 1, target);
        if(found<0){
            System.out.println("Not present");
        }else
            System.out.println("Present");
    }

    private static int recuriveImpl(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index : " + mid + " and the value is : " + arr[mid]);
                return mid;
            } else if (arr[mid] > target)
                return recuriveImpl(arr, low, mid -1, target);
            else
               return recuriveImpl(arr, mid+1, high, target);
        }
        System.out.println("Element doesn't exist");
        return -1;
    }
}
