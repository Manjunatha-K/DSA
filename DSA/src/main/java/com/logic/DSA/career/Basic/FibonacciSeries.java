package com.logic.DSA.career.Basic;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        for(int i =0;i<n;i++) {
            System.out.println( findfibonacci(i)+" ");
        }
    }

    private static int findfibonacci(int i) {
        if(i<=1)
            return i;
        return findfibonacci(i-1) + findfibonacci(i-2);
    }
}
