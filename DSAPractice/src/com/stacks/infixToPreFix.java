package com.stacks;

import java.util.Stack;

public class infixToPreFix {
    private static void findPreFix(String exp) {
        System.out.println("Befor replacing : "+ exp);
        String reversed = reverse(exp);
        System.out.println("reversed string is : " + reversed);
        reversed = findPostFix(reversed).reverse().toString();
        System.out.println("PreFix is : " + reversed);
    }

    private static StringBuilder findPostFix(String reversed) {
        StringBuilder postFix = new StringBuilder();
        Stack<Character> st = new Stack();
        char[] c = reversed.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if ((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] >= '0' && c[i] <= '9'))
                postFix.append(c[i]);
            else if (c[i] == '(')
                st.push(c[i]);
            else if (c[i] == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postFix.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() &&
                        (priority(c[i]) < priority(st.peek()) ||
                                (priority(c[i]) == priority(st.peek()) && c[i] != '^'))) {
                    postFix.append(st.pop());
                }
                st.push(c[i]);
            }
        }

        while (!st.isEmpty()) {
            postFix.append(st.pop());
        }
        System.out.println("postfix is : " + postFix);
        return postFix;
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

    private static String reverse(String exp) {
        StringBuilder sb = new StringBuilder(exp);
        String re = sb.reverse().toString();
        System.out.println("Before replacng : " + re);
        String tempPlaceHolder = "|";
        re = re.replace("(", tempPlaceHolder);
        re = re.replace(")", "(");
        re = re.replace(tempPlaceHolder, ")");
        return re;
    }

    public static void main(String[] args) {
        String exp = "(A+B)*C-D+F^G";
        findPreFix(exp);
    }


}
