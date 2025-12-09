package com.logic.DSA.career.Basic;

import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public static void main(String[] args) {
        int n  = 36;
        List<Integer> divisors = new ArrayList<>();
        for(int i =1;i*i <=n;i++){
            if(n%i == 0){
                divisors.add(i);
                if(n/i != i)
                    divisors.add(n/i);
            }
        }
        divisors.stream().sorted().forEach(i -> System.out.println(i));
    }
}
