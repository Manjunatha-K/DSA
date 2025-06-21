package com.logic.DSA.Arrays.Brute;

import java.util.*;

public class UnionOf2SortedArrays {

    public static void union(int[] arr1,int[] arr2){

        Set<Integer> unionSet = new HashSet<>();
        for(int i =0;i<arr1.length;i++)
            unionSet.add(arr1[i]);
        for(int i =0;i<arr2.length;i++)
            unionSet.add(arr2[i]);

        Iterator<Integer> it = unionSet.iterator();
        System.out.println("UNION OF TWO SORTED LISTS ARE :");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {5,6,7,8,9,10};
        union(arr1,arr2);
    }
}
