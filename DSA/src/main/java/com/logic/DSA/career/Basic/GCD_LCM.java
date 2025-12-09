package com.logic.DSA.career.Basic;

public class GCD_LCM {
    public static void main(String[] args) {
        int num1 = 16, num2 = 12;
        int min = Math.min(num1,num2);
        for(int i = min;i>=1;i--){
            if(num1%i == 0 && num2%i ==0){
                System.out.println("The GCD of two numbers is : "+i);
                break;
            }
        }
    }
}
