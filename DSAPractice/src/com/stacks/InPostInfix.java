package com.stacks;

import java.util.Stack;

public class InPostInfix {
    private static void findprefixSum(String expression) {
        Stack<Character> st = new Stack();
        StringBuilder prefixSum = new StringBuilder();
        char[] ch = expression.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9')) {
                prefixSum.append(ch[i]);
            } else if (ch[i] == '(') {
                st.push(ch[i]);

            } else if (ch[i] == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    prefixSum.append(st.peek());
                    st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && priority(ch[i]) <= priority(st.peek())) {
                    prefixSum.append(st.pop());
                }
                st.push(ch[i]);
            }
        }
        while (!st.isEmpty())
            prefixSum.append(st.pop());
        System.out.println("prefixSum is : " + prefixSum);
    }

    private static int priority(char ch) {
        if (ch == '^') {
            return 2;
        } else if (ch == '*' || ch == '/')
            return 1;
        else if (ch == '+' || ch == '-')
            return 0;
        else return -1;
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)";
        findprefixSum(expression);
    }


}
