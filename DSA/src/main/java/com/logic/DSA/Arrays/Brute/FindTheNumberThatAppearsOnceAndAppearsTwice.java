package com.logic.DSA.Arrays.Brute;

public class FindTheNumberThatAppearsOnceAndAppearsTwice {

    private static void appearsOnce(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        int temp[] = new int[max + 1];
        for (int j = 0; j < n; j++)
            temp[arr[j]]++;

        for(int x =0;x<max+1;x++){
            if(temp[x]==1){
                System.out.println("THE NUMBER THAT APPEARS ONCE IS : "+ x);
                return;
            }
        }
        System.out.println("THERE'S NO NUMBER THAT APPEARS ONCE");

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2,3, 4, 5, 3, 4, 5, 6, 6, 7, 7, 8, 8};
        appearsOnce(arr);
    }


}
