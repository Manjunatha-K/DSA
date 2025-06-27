package com.logic.DSA.BinarySearch;

public class KthEleOfTwoSortedArrays_Brute {

    private static void findKthElement(int[] arr1, int[] arr2, int k) {

        int m = arr1.length;
        int n = arr2.length;
        int i =0;
        int j =0;
        int counter=0;
        while(i<m && j<n){
            if(counter == k-1){
                System.out.println("The "+k+"th Element of two sorted arrays will be : ");
                System.out.println(arr1[i]>arr2[j]? arr2[j]:arr1[i]);
                break;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }else{
                 j++;
            }
            counter++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 6};
        int[] arr2 = {4, 7, 8, 9, 100};
        int k = 6;

        findKthElement(arr1, arr2,k);
    }
}
