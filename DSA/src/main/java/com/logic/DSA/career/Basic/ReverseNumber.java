package com.logic.DSA.career.Basic;

public class ReverseNumber {

    public static void main(String[] args) {
        int n = 11345111;
        int temp = n;
        int rev =0;
        while(temp!= 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        System.out.println(rev);
    }
}
