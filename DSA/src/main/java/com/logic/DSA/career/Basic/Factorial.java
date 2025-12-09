package com.logic.DSA.career.Basic;

public class Factorial {

    public static void main(String[] args) {
       int factorial = findFactorial(6, 1);
        System.out.println("factorial is : "+factorial);
    }

    private static int findFactorial(int i, int factorial) {
        if(i<1)
            return factorial;
        return findFactorial(i-1,factorial*i);
    }
}
