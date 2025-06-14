package com.logic.DSA.Arrays.Brute;

public class MovingZerostoEnd {
    private static void moveZerosToEnd(int[] arr) {
        int zeroIndex = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0){
                zeroIndex = i;
                break;
            }
        }
        for(int j =zeroIndex+1;j<arr.length;j++){
            if(arr[j] != 0 && arr[zeroIndex] == 0){
                swap(arr,j,zeroIndex);
                zeroIndex++;
            }
        }

        System.out.println("AFTER MOVING ZEROS TO END");
        for(int x =0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    private static void swap(int[] arr, int j, int zeroIndex) {
        int temp = arr[j];
        arr[j] = arr[zeroIndex];
        arr[zeroIndex] = temp;
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,1,0,1,1,0,0,0,1,1,1};
        moveZerosToEnd(arr);

    }

}
