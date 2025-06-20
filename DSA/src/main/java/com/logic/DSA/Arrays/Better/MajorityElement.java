package com.logic.DSA.Arrays.Better;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,4,5};
        int ele = arr[0];
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(count == 0){
                ele = arr[i];
                count=1;
            }else if(ele == arr[i]){
                count++;
            }

            else
                count--;
        }
        System.out.println(count +"--"+ele);
        if(count>0)
            System.out.println("THE MAJORITY ELEMENT IS : "+ ele);
        else
            System.out.println("NO MAJORITY ELEMENT");
    }
}
