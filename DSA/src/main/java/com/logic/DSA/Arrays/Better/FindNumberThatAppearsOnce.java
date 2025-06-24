package com.logic.DSA.Arrays.Better;

import java.util.Arrays;

public class FindNumberThatAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        int xor1 = 0;
        int num = Arrays.stream(arr).reduce(xor1,(a,xor) ->a^xor);
        System.out.println("The Numbers that appears once is : "+num);
    }
}
