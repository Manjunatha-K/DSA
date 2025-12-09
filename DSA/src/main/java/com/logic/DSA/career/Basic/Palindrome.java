package com.logic.DSA.career.Basic;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1111111;
        int temp = n;
        int rev =0;
        while(temp!= 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        if(rev == n)
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");
    }
}
