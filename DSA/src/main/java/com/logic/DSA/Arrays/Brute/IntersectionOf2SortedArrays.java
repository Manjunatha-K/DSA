package com.logic.DSA.Arrays.Brute;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2SortedArrays {

    public static void main(String[] args) {

        int a[] = {1, 2, 2,4, 6, 7, 8};
        int b[] = {2,2, 3, 5, 7, 9, 10, 11, 12, 13, 14};
        intersectionOfArray(a,b);

    }

    private static void intersectionOfArray(int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else if (!res.contains(a[i])) {
                res.add(a[i]);
                i++;
                j++;
            }
        }

        System.out.println("INTERSECTION OF TWO SORTED ARRAYS IS");
        for (Integer x : res) {
            System.out.println(x);
        }
    }
}
