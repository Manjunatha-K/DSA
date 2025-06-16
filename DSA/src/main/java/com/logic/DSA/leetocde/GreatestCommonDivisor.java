package com.logic.DSA.leetocde;

public class GreatestCommonDivisor {

    private static void recursive(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty()){
            System.out.println("NO GCD");
            return;
        }

        while (!str1.isEmpty() && !str2.isEmpty()){
            if(str1.length() == str2.length()) {
                System.out.println("GCD OF TWO STRINGS IS : " + str1);
                return;
            }
            else if(str1.length() > str2.length() && str1.startsWith(str2)) {
                    str1 = str1.replaceFirst(str2,"");
                    if(str1.length()>str2.length())
                        recursive(str1, str2);
                    else
                        recursive(str2, str1);
            }else if(str2.length() > str1.length() && str2.startsWith(str1)){
                str2 = str2.replaceFirst(str1,"");
                if(str1.length()>str2.length())
                    recursive(str1, str2);
                else
                    recursive(str2, str1);
            }else{
                System.out.println("NO GCD");
                return ;
            }
        }


    }
    public static void main(String[] args){
       String str1 = "AAAABBA";
       String str2 = "AAAAA";

       recursive(str1,str2);
    }
}
