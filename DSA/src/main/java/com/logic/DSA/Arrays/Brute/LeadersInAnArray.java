package com.logic.DSA.Arrays.Brute;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    private static void checkLeaders(int[] arr) {
        int index = 0;
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader)
                result.add(arr[i]);

        }

        System.out.println("THE LEADERS IN AN ARRAY ARE");
        for(Integer ele : result)
            System.out.println(ele);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 67, 8, 6, 4, 9, 0, 1, 3, 6, 27, 8, 9};

        checkLeaders(arr);
    }


}
