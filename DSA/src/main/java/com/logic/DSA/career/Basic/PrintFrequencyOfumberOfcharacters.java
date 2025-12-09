package com.logic.DSA.career.Basic;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequencyOfumberOfcharacters {
    public static void main(String[] args) {
        String name = "Manjunatha";
        Map<Character, Integer> frequency = new HashMap<>();
        char[] chars = name.toCharArray();
        for(int i=0;i<chars.length;i++){
            frequency.put(chars[i], frequency.getOrDefault(chars[i],0)+1);
        }
        System.out.println("frequency of each characters is ");
       frequency.forEach( (Character key,Integer value) -> System.out.println("character : "+key+" and the frequency is : "+value));
    }
}
