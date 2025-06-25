package com.logic.DSA.BinarySearch;

public class FindTheSQRTOfANumberUsingBS {
private static void findSQRT(int num){
    int low = 0;
    int high = num;
    int mid = -1;
    int sqrt = -1;
    while(low<=high){
        mid = (low+high)/2;
        if(mid * mid == num){
            sqrt = mid;
            System.out.println("SQRT of : "+ num +" is : "+ sqrt);
            return;
        }else if(mid*mid > num){
            high = mid-1;
        }else {
            sqrt = mid;
            low = mid+1;
        }
    }
    System.out.println("No SQRT");
}
    public static void main(String[] args) {
        int num = 63;
        findSQRT(num);
    }
}
