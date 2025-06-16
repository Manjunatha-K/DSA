package com.logic.DSA.leetocde;

public class Merge2StringsAlternatively {

    public static void main(String[] args){
        String str1 = "Manju";
        String str2 = "Nandhini";
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        StringBuilder result = new StringBuilder();
        int i =0,j =0;
        while(i<c1.length && j<c2.length){
            result.append(c1[i]);
            result.append(c2[j]);
            i++;
            j++;
        }
        while(i<c1.length){
            result.append(c1[i]);
            i++;
        }
        while(j<c2.length){
            result.append(c2[j]);
            j++;
        }
        System.out.println("The resulting string is : "+ result);
    }
}
