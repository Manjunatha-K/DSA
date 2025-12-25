package com.stacks;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String word = "[(){{}}()]";
        boolean isBalanced = find(word);
        System.out.println(isBalanced);
    }

    private static boolean find(String word) {
        Stack st = new Stack();
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
                st.push(arr[i]);
            } else {
                if (st.isEmpty())
                    return false;
                //return;
                char ch = (char) st.pop();

                if ((arr[i] == '}' && ch == '{') ||
                        (arr[i] == ']' && ch == '[') ||
                        (arr[i] == ')' && ch == '(')) {
                    continue;
                } else
                    return false;
            }
        }
        return st.isEmpty();
    }
}
