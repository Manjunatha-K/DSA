package com.logic.DSA.Arrays.Brute;

public class MovingZerosToStart {
    private static void moveZerosToStart(int[] arr) {
        int oneIndex = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 1){
                oneIndex = i;
                break;
            }
        }
        for(int j =oneIndex+1;j<arr.length;j++){
            if(arr[j] != 1 && arr[oneIndex] == 1){
                swap(arr,j,oneIndex);
                oneIndex++;
            }
        }

        System.out.println("AFTER MOVING ZEROS TO END");
        for(int x =0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    private static void swap(int[] arr, int j, int oneIndex) {
        int temp = arr[j];
        arr[j] = arr[oneIndex];
        arr[oneIndex] = temp;
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,1,0,1,1,0,0,0,1,1,1};
        moveZerosToStart(arr);

    }


}
