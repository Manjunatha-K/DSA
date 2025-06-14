package com.logic.DSA.Arrays.Brute;

import java.util.*;

public class UnionOf2SortedArrays {

    public static void union(int[] arr1,int[] arr2){

        List<Integer> res = new ArrayList<>();
        Set<Integer> unionSet = new HashSet<>();
        for(int i =0;i<arr1.length;i++)
            unionSet.add(arr1[i]);
        for(int i =0;i<arr2.length;i++)
            unionSet.add(arr2[i]);

        Iterator<Integer> it = unionSet.iterator();
        while(it.hasNext()){
           res.add(it.next());
        }
        System.out.println("UNION OF TWO SORTED LISTS ARE :");
        for(Integer x : res)
            System.out.println(x);
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {5,6,7,8,9,10};
        union(arr1,arr2);
    }
}
