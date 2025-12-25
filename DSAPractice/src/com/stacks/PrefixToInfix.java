package com.stacks;

import java.util.Stack;

public class PrefixToInfix {

    private static void findInfix(String exp) {
        Stack<String> st = new Stack();
        char[] c = exp.toCharArray();
        for(int i= c.length-1;i>=0;i--){
            if((c[i]>='A' && c[i]<='Z') || (c[i]>='a' && c[i]<='z') || (c[i]>='0' && c[i]<='9')){
                st.push(String.valueOf(c[i]));
            }else{
                String t1 =  st.pop();
                String t2 =  st.pop();
                String ex = String.valueOf('('+ t1 +c[i]+t2+')');
                st.push(ex);
            }
        }
        System.out.println(st.peek());
    }

    public static void main(String[] args) {
        String exp = "*+pq-MN";
        findInfix(exp);
    }
}
