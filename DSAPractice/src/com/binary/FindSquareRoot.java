package com.binary;

public class FindSquareRoot {
    public static void main(String[] args){
        int n = 110;
        find2ndRoot(n);
    }

    private static void find2ndRoot(int n) {
        int root = -1;
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid == n){
                System.out.println("Square root is : "+ mid);
                return;
            }else if(mid * mid <n){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println("No square root found");
    }
}
